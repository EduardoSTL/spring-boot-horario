package com.eduardo.springboothorario.controllers;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Data
public class AppController {
    @Value("${config.horario.apertura}")
    private Integer apertura;

    @Value("${config.horario.cierre}")
    private Integer cierre;

    @GetMapping({"/", "/index"})
    public String index(Model model){
        model.addAttribute("titulo", "Bienvenido al horario de atencion al cliente");
        return "index";
    }
}
