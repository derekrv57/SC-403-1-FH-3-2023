/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.audio.player.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author derek
 */
@Controller
public class FileUploadController {

    private static final String UPLOAD_DIR = ".songs";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/uploadPage")
    public String uploadPage() {
        return "upload";
    }

    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("files") MultipartFile[] files,
                                   @RequestParam("albumTitle") String albumTitle,
                                   Model model) {
        // Crear el álbum en la base de datos
        jdbcTemplate.update("INSERT INTO Álbum (Título, Pública) VALUES (?, 0)", albumTitle);

        Long albumId = jdbcTemplate.queryForObject("SELECT LAST_INSERT_ID()", Long.class);

        List<String> fileNames = new ArrayList<>();

        for (MultipartFile file : files) {
            if (file.isEmpty()) {
                continue; // Skip empty files
            }

            try {
                if (!new File(UPLOAD_DIR).exists()) {
                    new File(UPLOAD_DIR).mkdir();
                }
                String fileName = file.getOriginalFilename().replace(".wav", "");
                String filePath = UPLOAD_DIR + fileName;

                // Guardar archivo en el servidor
                File dest = new File(filePath);
                file.transferTo(dest);

                // Insertar canción en la base de datos
                jdbcTemplate.update("INSERT INTO Canción (Nombre, Dir, IDÁlbum) VALUES (?, ?, ?)",
                        fileName, filePath, albumId);

                fileNames.add(fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        model.addAttribute("fileNames", fileNames);
        return "uploadResults";
    }
}
