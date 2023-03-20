package com.eoi.paradigmaspoospringboot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The type Demo paradigmas.
 */
@SpringBootApplication
public class DemoParadigmasPOOSpring implements CommandLineRunner {

    //@Autowired
    //@Qualifier("mesaGenial")
    //private Mueble mesa;

    @Autowired
    @Qualifier("mesaRandom")
    private Mueble mesaRandom;


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        /* Al realizar la inversión de control, y dar el control a Spring, ya no necesitamos crear nosotros mismos los objetos.
        *  Convertimos toda la aplicación a Spring
        */

        SpringApplication.run (DemoParadigmasPOOSpring.class, args);
    }
    @Override
    public void run(String... args ) throws  Exception
    {
        //mesa.showInfo();
        mesaRandom.showInfo();
    }

}
