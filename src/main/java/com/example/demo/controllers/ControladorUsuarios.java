package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ControladorUsuarios {

    @GetMapping("/")
    String hellow() {
        return "Hello World!";
    }

    @GetMapping("/hola")
    String hola() {
        return "Hola World!";
    }

    @GetMapping("/mimedicacion")
    String miMedicacion() {
        return "Tomate las pastillas";
    }



}
