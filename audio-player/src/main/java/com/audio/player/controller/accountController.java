package com.audio.player.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class accountController {

    @GetMapping("/acount")
    public String accountPage() {
        return "acount";
    }
}
