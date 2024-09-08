package com.zosh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping
    public String Home(){
        return "Welcome to trading app platform";
    }
    @GetMapping("/api")
    public String secureapi(){
        return "this is secure and protected";
    }
}
