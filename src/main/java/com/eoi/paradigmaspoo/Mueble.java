package com.eoi.paradigmaspoo;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Mueble. La clase mueble comprende todos aquellos objetos físicos que tienen una habitación.
 * Además, todos los objetos de la clase Mueble, tienen un ArrayList de Componentes de Mueble (ComponenteDeMueble.class)
 */
@Component
@Log4j2
public abstract class Mueble extends ObjetoFisico {


    /**
     * Se utiliza para guardar el nombre de la habitación en la que se encuentra el mueble.
     */
    private String habitacion;

    /**
     * The Componentes.
     */
    protected List<ComponenteDeMueble> componentes = new ArrayList<>();


    /**
     * Instantiates a new Mueble.
     *
     * @param nombre   the nombre
     * @param alto     the alto
     * @param ancho    the ancho
     * @param fondo    the fondo
     * @param peso     the peso
     * @param material the material
     */
    protected Mueble(String nombre, int alto, int ancho, int fondo, int peso, String material) {
        super(nombre, alto, ancho, fondo, peso, material);
    }

    /**
     * Instantiates a new Mueble.
     *
     * @param nombre     the nombre
     * @param alto       the alto
     * @param ancho      the ancho
     * @param fondo      the fondo
     * @param peso       the peso
     * @param material   the material
     * @param habitacion the habitacion
     */
    protected Mueble(String nombre, int alto, int ancho, int fondo, int peso, String material, String habitacion) {
        super(nombre, alto, ancho, fondo, peso, material);
        this.habitacion = habitacion;
    }

    /**
     * Gets componentes.
     *
     * @return the componentes
     */
    public List<ComponenteDeMueble> getComponentes() {
        return componentes;
    }

    /**
     * Sets componentes.
     *
     * @param componentes the componentes
     */
    public void setComponentes(List<ComponenteDeMueble> componentes) {
        this.componentes = componentes;
    }

    /**
     * El método showInfo muestra en pantalla la información básica de un Mueble
     */
    @Override
    public void showInfo() {
        System.out.println("FICHA DE MUEBLE");
        super.showInfo();
        System.out.println("Numero de componentes: " + componentes.size());
        System.out.println("Listado de Componentes: ");
        componentes.forEach(n ->  {
            ObjetoFisico o =  n;
            o.showInfo();
        });
    }

    /**
     * Pintar mueble.
     *
     * @param color El color del que queremos pintar el mueble. Los colores disponibles son amarillo, rojo, azul y verde.
     * @return Devuelve un mensaje confirmando que el mueble ha sido pintado.
     */
    public String pintarMueble(String color) {

        log.warn("YA HE PINTADO EL MUEBLE");
        return "YA HE PINTADO EL MUEBLE";
    }


    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

}
