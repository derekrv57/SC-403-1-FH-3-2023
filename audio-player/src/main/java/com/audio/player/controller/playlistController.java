package com.audio.player.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class playlistController {

    @GetMapping("/playlist")
    public String playlistPage() {
        return "playlist";
    }
}
