package com.audio.player.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class artistController {

    @GetMapping("/artist")
    public String artistPage() {
        return "artist";
    }
}
