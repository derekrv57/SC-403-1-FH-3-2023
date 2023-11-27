package com.audio.player.controller;

import com.audio.player.services.songService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class albumController {
private final songService songService;

    @Autowired
    public albumController(songService songService) {
        this.songService = songService;
    }

    @GetMapping("/album")
    public String songPage(Model model) {
        var songs = songService.getSongs();
        model.addAttribute("songs", songs);
        return "album";
    }
}
