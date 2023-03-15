package com.example.paradigmaspoo;

/**
 * The type Objeto fisico.
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
    public void showInfo(){
        System.out.println ("Nombre: " + this.nombre + "\n" +
                            "Material: " + this.material + "\n" +
                            "Alto: " + this.alto + "\n" +
                            "Ancho: " + this.ancho + "\n" +
                            "Fondo: " + this.fondo + "\n" +
                            "Peso:" + this.peso
        );
    }




}
