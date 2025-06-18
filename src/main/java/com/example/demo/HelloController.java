package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/HI")
    public String HI() {
        return "Welcome, Aarisha!";
    }
}
