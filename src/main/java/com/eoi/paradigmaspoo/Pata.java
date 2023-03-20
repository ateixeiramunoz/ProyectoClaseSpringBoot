package com.eoi.paradigmaspoo;

import org.springframework.stereotype.Component;

/**
 * The type Pata.
 */
@Component
public abstract class Pata extends ComponenteDeMueble{

    /**
     *  Define la forma de la pata
     */
    private String forma;

    /**
     * Instantiates a new Pata.
     *
     * @param nombre   the nombre
     * @param alto     the alto
     * @param ancho    the ancho
     * @param fondo    the fondo
     * @param peso     the peso
     * @param material the material
     */
    protected Pata(String nombre, int alto, int ancho, int fondo, int peso, String material) {
        super(nombre, alto, ancho, fondo, peso, material);
    }

    /**
     * Instantiates a new Pata.
     *
     * @param nombre   the nombre
     * @param alto     the alto
     * @param ancho    the ancho
     * @param fondo    the fondo
     * @param peso     the peso
     * @param material the material
     * @param forma    the forma
     */
    protected Pata(String nombre, int alto, int ancho, int fondo, int peso, String material, String forma) {
        super(nombre, alto, ancho, fondo, peso, material);
        this.forma = forma;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Forma: " + forma);
    }
}
