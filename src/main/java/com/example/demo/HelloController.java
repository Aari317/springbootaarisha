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
    public String greet(String username, String lastname, String email, Model model) {
        model.addAttribute("userloggedin", username);
        model.addAttribute("userInput2", lastname);
        model.addAttribute("userEmail", email);
        System.out.println("username: " + username );
        System.out.println("lastname: " + lastname );
        System.out.println("email: " + email);
        return "result";
    }
}


    
  