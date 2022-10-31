package com.fescoder.cooperativebilling;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prueba")
public class PruebaController {
    @GetMapping("/hola")
    public String saludar() {
        return "Hola Mundo";
    }
}
