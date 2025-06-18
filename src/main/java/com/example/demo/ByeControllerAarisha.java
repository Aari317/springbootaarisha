package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ByeControllerAarisha {

    @GetMapping("/bye")
    public String home() {
        return "Bye, Aarisha!";
    }

    @GetMapping("/greet")
    public String greet() {
        return "Greetings, Aarisha!";
    }
    //hello
}