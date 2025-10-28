package com.example.F1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("mensagem", "Bem-vindo à página inicial!");
        return "index";
    }

    @GetMapping("/chororo")
    public String chororo() {
        return "chororo";
    }

}
