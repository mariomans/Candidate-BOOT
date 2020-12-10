package com.example.backend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@CrossOrigin
public class HomeController {
    
    @GetMapping("/")
    public String home() {
        return "Hellow from spring Boot";
    }
    
}
