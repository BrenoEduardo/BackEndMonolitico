package com.example.demo.controller;

import com.example.demo.model.Dominio;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DominioController {
    
    @GetMapping("/alo")
    public Dominio greeting() {
        return new Dominio("Alo mundo");
    }
}
