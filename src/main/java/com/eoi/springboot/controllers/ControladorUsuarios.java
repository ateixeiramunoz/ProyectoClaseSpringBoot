package com.eoi.springboot.controllers;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.origin.SystemEnvironmentOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Controlador usuarios.
 */
@RestController
@Log4j2
public class ControladorUsuarios {
    @Value("${mensaje.pastillas}")
    private String mensajeMedicacion;
    @Value("${mensaje.hola}")
    private String mensajeHola;


    /**
     * Hola string.
     *
     * @return the string
     */
    @GetMapping("${url.hola}")
    String hola() {
        log.warn(mensajeHola);
        return mensajeHola;
    }


    /**
     * Mi medicacion string.
     *
     * @return the string
     */
    @GetMapping("${url.pastillas}")
    String miMedicacion() {
        log.warn(mensajeMedicacion);
        return mensajeMedicacion;
    }



}
