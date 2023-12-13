package com.audio.player.controller;

import com.audio.player.domain.Cancion;
import com.audio.player.domain.album;
import com.audio.player.services.albumservice;
import com.audio.player.services.songService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
        @Autowired
    private albumservice albumService;

    @GetMapping("/{id}")
    public ResponseEntity<album> getAlbumById(@PathVariable Integer id) {
        return albumService.getAlbumById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{id}/canciones")
    public ResponseEntity<List<Cancion>> getCancionesByAlbumId(@PathVariable Integer id) {
        List<Cancion> canciones = albumService.getCancionesByAlbumId(id);
        return canciones != null ? ResponseEntity.ok(canciones) : ResponseEntity.notFound().build();
    }
}
