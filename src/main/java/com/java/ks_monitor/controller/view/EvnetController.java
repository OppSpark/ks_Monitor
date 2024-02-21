package com.java.ks_monitor.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/events")
@Controller
public class EvnetController {

    @GetMapping("/")
    public String evnets(){
        return "evnet/index";
    }

    @GetMapping("/{eventId}")
    public String eventDetail(@PathVariable Integer eventId){
        return "evnet/detail";
    }
}
