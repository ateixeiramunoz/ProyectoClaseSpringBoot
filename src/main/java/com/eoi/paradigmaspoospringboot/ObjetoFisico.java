package com.eoi.paradigmaspoospringboot;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * La clase Objeto fisico. Esta clase representa un concepto de objeto abstracto, en el que englobamos todos
 * aquellos objetos que poseen propiedades físicas. Es un ejemplo del paradigma de ABSTRACCION.
 */
public abstract class ObjetoFisico {


    private String nombre;

    private int alto;

    private int ancho;

    private int fondo;

    private int peso;

    private String material;

    /**
     * Instantiates a new Objeto fisico.
     *
     * @param nombre   the nombre
     * @param alto     the alto
     * @param ancho    the ancho
     * @param fondo    the fondo
     * @param peso     the peso
     * @param material the material
     */
    protected ObjetoFisico(String nombre, int alto, int ancho, int fondo, int peso, String material) {
        this.nombre = nombre;
        this.alto = alto;
        this.ancho = ancho;
        this.fondo = fondo;
        this.peso = peso;
        this.material = material;
    }

    /**
     * Show info.
     */
    @Autowired
    public void showInfo(){
        System.out.println ("Nombre: " + this.nombre + "\n" +
                            "Material: " + this.material + "\n" +
                            "Alto: " + this.alto + "\n" +
                            "Ancho: " + this.ancho + "\n" +
                            "Fondo: " + this.fondo + "\n" +
                            "Peso:" + this.peso
        );
    }

    /**
     * Instantiates a new Objeto fisico.
     */
    public ObjetoFisico(){};

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getFondo() {
        return fondo;
    }

    public void setFondo(int fondo) {
        this.fondo = fondo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
