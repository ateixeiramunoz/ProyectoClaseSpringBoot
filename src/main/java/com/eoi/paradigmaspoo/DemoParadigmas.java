package com.eoi.paradigmaspoo;


/**
 * The type Demo paradigmas.
 */
public class DemoParadigmas {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        ComponenteDeMueble pata1 = new PataStandar();
        ComponenteDeMueble pata2 = new PataStandar();
        ComponenteDeMueble pata3 = new PataStandar();
        ComponenteDeMueble pata4 = new PataStandar();

        Tablero tablero = new Tablero("tablero estandar", 3,90,60, 3, "madera");
        Tablero tableroCristal = new Tablero("tablero de Cristal", 3,90,60, 3, "madera");

        Mesa mesa1 = new Mesa("Mesa Bonita", 90, 100, 100, 15, "Madera","Salón", pata1, pata2, pata3, pata4, tablero);
        mesa1.showInfo();

        //Mesa mesaCristal = new Mesa("Mesa Bonita de cristal", 90, 100, 100, 15, "Madera y Cristal","Salón", pata1, pata2, pata3, pata4, tableroCristal);
        //mesaCristal.showInfo();

    }

}
