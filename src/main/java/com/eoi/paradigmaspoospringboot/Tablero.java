package com.eoi.paradigmaspoospringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * The type Tablero.
 */
@Component
public abstract class Tablero extends ComponenteDeMueble {
    @Autowired
    @Value("circulartest")
    private String forma;

    /**
     * Instantiates a new Tablero.
     *
     * @param nombre   the nombre
     * @param alto     the alto
     * @param ancho    the ancho
     * @param fondo    the fondo
     * @param peso     the peso
     * @param material the material
     * @param forma    the forma
     */
    public Tablero(String nombre, int alto, int ancho, int fondo, int peso, String material, String forma) {
        super(nombre, alto, ancho, fondo, peso, material);
        this.forma = forma;
    }

    /**
     * Instantiates a new Tablero.
     */
    public Tablero(){}

    /**
     * Instantiates a new Tablero.
     *
     * @param forma the forma
     */
    public Tablero(String forma) {
        this.forma = forma;
    }


    @Override
    public void showInfo() {
        super.showInfo();
    }

}
