package com.java.ks_monitor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/admin")
    public String login(){
        return "auth/login";
    }

    @GetMapping("/sign-up")
    public  String signup(){
        return "auth/sign-up";
    }
}
