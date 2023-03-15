package com.example.paradigmaspoo;

import java.util.List;

public class Mesa extends Mueble {

    private ComponenteDeMueble pata1;
    private ComponenteDeMueble pata2;
    private ComponenteDeMueble pata3;
    private ComponenteDeMueble pata4;
    private ComponenteDeMueble tablero;


    public Mesa(String nombre, int alto, int ancho, int fondo, int peso, String material, String habitacion, ComponenteDeMueble pata1, ComponenteDeMueble pata2, ComponenteDeMueble pata3, ComponenteDeMueble pata4, ComponenteDeMueble tablero) {
        super(nombre, alto, ancho, fondo, peso, material, habitacion);
        this.pata1 = pata1;
        this.pata2 = pata2;
        this.pata3 = pata3;
        this.pata4 = pata4;
        this.tablero = tablero;
        this.componentes.add(pata1);
        this.componentes.add(pata2);
        this.componentes.add(pata3);
        this.componentes.add(pata4);
        this.componentes.add(tablero);

    }

}
