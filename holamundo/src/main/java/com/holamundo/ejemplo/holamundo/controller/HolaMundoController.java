package com.holamundo.ejemplo.holamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HolaMundoController {

    @GetMapping("/hola")
    public String holaMundo (){
        return "Hola Mundo, soy David Diaz || 16-03-2026 XD ";
    }
}
