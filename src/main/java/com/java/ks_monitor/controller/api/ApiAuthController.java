package com.java.ks_monitor.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class ApiAuthController {

    @GetMapping("/sign-up")
    public String signUP(){
        return "done.";
    }

    @GetMapping("/login")
    public String login() {
        return "done.";
    }
}
