package com.audio.player.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class joinController {

    @GetMapping("/join")
    public String joinPage() {
        return "join";
    }
}
