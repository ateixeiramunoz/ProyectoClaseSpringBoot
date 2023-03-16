package com.eoi.paradigmasPOOSpringBoot;

import com.eoi.paradigmasPOOSpringBoot.ComponenteDeMueble;
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

    public Tablero(String nombre, int alto, int ancho, int fondo, int peso, String material, String forma) {
        super(nombre, alto, ancho, fondo, peso, material);
        this.forma = forma;
    }

    public Tablero(){}

    public Tablero(String forma) {
        this.forma = forma;
    }


    @Override
    public void showInfo() {
        super.showInfo();
    }

}
