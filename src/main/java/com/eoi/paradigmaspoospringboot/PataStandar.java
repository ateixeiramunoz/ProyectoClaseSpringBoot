package com.eoi.paradigmaspoospringboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * The type Pata standar.
 */
@Component(value="pataOK")
public class PataStandar extends Pata {


    @Autowired
    private Environment env;

    /**
     * Instantiates a new Pata standar.
     *
     * @param nombre   the nombre
     * @param alto     the alto
     * @param ancho    the ancho
     * @param fondo    the fondo
     * @param peso     the peso
     * @param material the material
     * @param forma    the forma
     */
    public PataStandar(String nombre, int alto, int ancho, int fondo,int peso, String material, String forma) {
            super(nombre, alto,ancho, fondo, peso, material, forma);
    }

    /**
     * Instantiates a new Pata standar.
     */
    public PataStandar() {

        super("Pata Standar", 100, 2, 2, 1, "madera", "cilindro");
    }

    /**
     * Instantiates a new Pata standar.
     *
     * @param alto the alto
     */
    public PataStandar(int alto) {

        super("Pata Standar", alto, 2, 2, 1, "madera", "cilindro");
    }

}
