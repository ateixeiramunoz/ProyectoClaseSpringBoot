package com.example.paradigmaspoo;

public abstract class Pata extends ComponenteDeMueble{

    private String forma;

    public Pata(String nombre, int alto, int ancho, int fondo, int peso, String material) {
        super(nombre, alto, ancho, fondo, peso, material);
    }

    public Pata(String nombre, int alto, int ancho, int fondo, int peso, String material, String forma) {
        super(nombre, alto, ancho, fondo, peso, material);
        this.forma = forma;
    }



}
