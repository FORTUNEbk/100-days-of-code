package com.example.Spring.security.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String greet() { // Changed 'string' to 'String' and removed the extra 'public'
        return "Welcome to security practice";
    }
}
