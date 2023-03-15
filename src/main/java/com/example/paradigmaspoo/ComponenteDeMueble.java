package com.example.paradigmaspoo;

public abstract class ComponenteDeMueble extends ObjetoFisico {

    private String color;

    private String posicion;

    protected ComponenteDeMueble(String nombre, int alto, int ancho, int fondo, int peso, String material) {
        super(nombre, alto, ancho, fondo, peso, material);
    }

    @Override
    public void showInfo() {
        System.out.println("COMPONENTE:");
        super.showInfo();
    }
}
