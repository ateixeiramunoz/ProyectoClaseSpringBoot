package com.eoi.paradigmasPOOSpringBoot;


import org.springframework.stereotype.Component;

/**
 * The type Pata standar.
 */
@Component(value="TableroCristal")
public class TableroStandar extends Tablero {

    /**
     * Instantiates a new Pata standar.
     */
    public TableroStandar() {
        super("Tablero Cristal", 45, 2, 2, 1, "cristal", "cilindro");
    }

}
