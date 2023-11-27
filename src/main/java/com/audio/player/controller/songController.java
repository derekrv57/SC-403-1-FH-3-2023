package com.audio.player.controller;

import com.audio.player.services.songService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class songController {

    private final songService songService;

    @Autowired
    public songController(songService songService) {
        this.songService = songService;
    }

    @GetMapping("/song")
    public String songPage(Model model) {
        var songs = songService.getSongs();
        model.addAttribute("songs", songs);
        return "song";
    }
}
