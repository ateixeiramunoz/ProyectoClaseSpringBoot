package com.example.demo.controllers;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class ControladorUsuarios {

    @GetMapping("/hola")
    String hola() {
        log.warn("Hola Mundo!");
        System.out.println("Hola Mundo!");
        return "Hola mundo!";
    }

    @GetMapping("/mimedicacion")
    String miMedicacion() {
        log.warn("Tomate las pastillas");
        System.out.println("Tomate las pastillas");
        return "Tomate las pastillas";
    }

}
