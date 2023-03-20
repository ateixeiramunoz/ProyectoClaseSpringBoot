package com.eoi.paradigmaspoo;


import org.springframework.stereotype.Component;

/**
 * The type Pata standar.
 */
@Component
public class PataStandar extends Pata {
    /**
     * Instantiates a new Pata standar.
     */
    public PataStandar() {
        super("Pata Standar", 40, 2, 2, 1, "madera", "cilindro");
    }
}
