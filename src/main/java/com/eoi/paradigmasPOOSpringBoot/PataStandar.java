package com.eoi.paradigmasPOOSpringBoot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
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
     */
    public PataStandar(String nombre, int alto, int ancho, int fondo,int peso, String material, String forma) {
            super(nombre, alto,ancho, fondo, peso, material, forma);
    }

    public PataStandar() {

        super("Pata Standar", 100, 2, 2, 1, "madera", "cilindro");
    }
    public PataStandar(int alto) {

        super("Pata Standar", alto, 2, 2, 1, "madera", "cilindro");
    }

}
