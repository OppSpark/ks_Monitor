package com.java.ks_monitor.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiAuthController {

    @GetMapping("/sign-up")
    public String signUp(){
        return "done";
    }

    @GetMapping("/login")
    public String login(){
        return "done";
    }
}
