package com.eoi.paradigmasPOOSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value="Mesa")
public class Mesa extends Mueble {

    private ComponenteDeMueble pata1;
    private ComponenteDeMueble pata2;
    private ComponenteDeMueble pata3;
    private ComponenteDeMueble pata4;
    private ComponenteDeMueble tablero;


    /**
     * Instantiates a new Mesa.
     *
     * @param nombre     the nombre
     * @param alto       the alto
     * @param ancho      the ancho
     * @param fondo      the fondo
     * @param peso       the peso
     * @param material   the material
     * @param habitacion the habitacion
     * @param pata1      the pata 1
     * @param pata2      the pata 2
     * @param pata3      the pata 3
     * @param pata4      the pata 4
     * @param tablero    the tablero
     */

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

    public Mesa(String nombre, int alto, int ancho, int fondo, int peso, String material, String habitacion, List<ComponenteDeMueble> component) {
        super(nombre, alto, ancho, fondo, peso, material, habitacion);
        this.pata1 = pata1;
        this.pata2 = pata2;
        this.pata3 = pata3;
        this.pata4 = pata4;
        this.componentes = component;
    }



    public Mesa() {
    }

}