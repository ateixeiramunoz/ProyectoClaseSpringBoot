package com.eoi.paradigmaspoospringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Config mesa.
 */
@Configuration
public class ConfigMesa {

    @Autowired
    @Value("${mesa.materiales}")
    private String[] materiales;


    @Autowired
    @Value("${mesa.nombre}")
    private String nombre;

    @Autowired
    @Value("${mesa.alto}")
    private int alto;

    @Autowired
    @Value("${mesa.ancho}")
    private int ancho;

    @Autowired
    @Value("${mesa.largo}")
    private int fondo;

    @Autowired
    @Value("${mesa.peso}")
    private int peso;

    @Autowired
    @Value("${mesa.material}")
    private String material;

    @Autowired
    @Value("${mesa.forma}")
    private String forma;

    @Autowired
    @Value("${mesa.habitacion}")
    private String habitacion;

    @Autowired
    @Value("${mesa.numeropatas}")
    private int numeropatas;

    /**
     * Configpatas config patas.
     *
     * @return the config patas
     */
    @Bean
    public ConfigPatas configpatas()
    {
        return new ConfigPatas();
    }

    /**
     * Mesa mesa.
     *
     * @return the mesa
     */
    @Bean(value="mesaGenial")
    public Mesa mesa()
    {
        List<ComponenteDeMueble> componentsList = new ArrayList<>();

        for (int a=0;a<numeropatas;a++)
        {
            componentsList.add(new PataStandar());
        }
        componentsList.add(new TableroStandar());
        return new Mesa(nombre,alto, ancho, fondo, peso,material, habitacion, componentsList);

    }

    /**
     * Mesa random mesa.
     *
     * @return the mesa
     */
    @Bean(value="mesaRandom")
    public Mesa mesaRandom()
    {
        List<ComponenteDeMueble> componentsList = new ArrayList<>();
        SecureRandom secureRandom = new SecureRandom();
        numeropatas = secureRandom.nextInt(20);
        alto = secureRandom.nextInt(10);
        ancho = secureRandom.nextInt(10);
        fondo = secureRandom.nextInt(10);
        peso = secureRandom.nextInt(10);
        for (int a=0;a<numeropatas;a++)
        {
            componentsList.add(configpatas().pataRandom());
        }
        componentsList.add(new TableroStandar());
        return new Mesa("Mesa RANDOM",alto, ancho, fondo, peso,materiales[secureRandom.nextInt(3)], habitacion, componentsList);
    }

}
