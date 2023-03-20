package com.eoi.springboot.controllers;

import com.eoi.paradigmaspoospringboot.PataStandar;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * The type Controlador cursos.
 */
@RestController
@Log4j2
@RequestMapping("${url.cursos}")
public class ControladorCursos {

    @Value("${mensaje.hola}")
    private String mensajeHola;

    /**
     * Hola string.
     *
     * @return the string
     */
    @GetMapping("/all")
    String list() {
        return null;
    }

    /**
     * Hola string.
     *
     * @return the string
     */
    @GetMapping("")
    @ResponseBody
    PataStandar create(@RequestParam("nombre") String valueOne) {
        //return "<html><body><h1>Bienvenido "+valueOne+"</h1><p>Este es un párrafo de ejemplo</p></body></html>";


        return new PataStandar();

      //    return valueOne;
    }


}
