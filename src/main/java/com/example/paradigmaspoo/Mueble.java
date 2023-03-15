package com.example.paradigmaspoo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public abstract class Mueble extends ObjetoFisico {

    private String habitacion;

    protected List componentes = new ArrayList<ComponenteDeMueble>();


    protected Mueble(String nombre, int alto, int ancho, int fondo, int peso, String material) {
        super(nombre, alto, ancho, fondo, peso, material);
    }

    protected Mueble(String nombre, int alto, int ancho, int fondo, int peso, String material, String habitacion) {
        super(nombre, alto, ancho, fondo, peso, material);
        this.habitacion = habitacion;
    }

    public List getComponentes() {
        return componentes;
    }

    public void setComponentes(List componentes) {
        this.componentes = componentes;
    }

    @Override
    public void showInfo() {
        System.out.println("FICHA DE MUEBLE");
        super.showInfo();
        System.out.println("Numero de componentes: " + componentes.size());
        System.out.println("Listado de Componentes: ");
        componentes.forEach((n) ->  {
            ObjetoFisico o = (ObjetoFisico) n;
            o.showInfo();
        });
    }
}
