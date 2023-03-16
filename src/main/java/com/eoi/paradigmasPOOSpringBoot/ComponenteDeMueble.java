package com.eoi.paradigmasPOOSpringBoot;

import com.eoi.paradigmasPOOSpringBoot.ObjetoFisico;
import org.springframework.stereotype.Component;

/**
 * The type Componente de mueble.
 */
@Component
public abstract class ComponenteDeMueble extends ObjetoFisico {

    private String color;

    private String posicion;

    /**
     * Instantiates a new Componente de mueble.
     *
     * @param nombre   the nombre
     * @param alto     the alto
     * @param ancho    the ancho
     * @param fondo    the fondo
     * @param peso     the peso
     * @param material the material
     */
    protected ComponenteDeMueble(String nombre, int alto, int ancho, int fondo, int peso, String material) {
        super(nombre, alto, ancho, fondo, peso, material);
    }

    @Override
    public void showInfo() {
        System.out.println("COMPONENTE:");
        super.showInfo();
    }
    public ComponenteDeMueble(){};

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}
