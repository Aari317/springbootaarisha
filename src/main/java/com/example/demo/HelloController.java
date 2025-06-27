package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

@Controller
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Home";
    }

  
    @PostMapping("/greet")
    public String greet(String username, Model model) {
        model.addAttribute("userloggedin", username);
        System.out.println("username: " + username );
        return "result";
    }
}


    
  