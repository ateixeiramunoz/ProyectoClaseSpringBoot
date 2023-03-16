package com.eoi.paradigmasPOOSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.security.SecureRandom;

@Configuration
public class ConfigPatas {

    @Autowired
    @Value("${pata.nombre}")
    private String nombre;

    @Autowired
    @Value("${pata.alto}")
    private int alto;

    @Autowired
    @Value("${pata.ancho}")
    private int ancho;

    @Autowired
    @Value("${pata.largo}")
    private int fondo;

    @Autowired
    @Value("${pata.peso}")
    private int peso;

    @Autowired
    @Value("${pata.nombre}")
    private String nombrePatagenial;

    @Autowired
    @Value("${pata.material}")
    private String material;

    @Autowired
    @Value("${pata.forma}")
    private String forma;

    @Bean(value="pataGenial")
    public PataStandar pata()
    {
        return new PataStandar(nombrePatagenial,alto, ancho, fondo, peso,material,forma);
    }

    @Bean(value="pataRandom")
    public PataStandar pataRandom()
    {
        SecureRandom secureRandom = new SecureRandom();
        return new PataStandar("Pata RANDOM",secureRandom.nextInt(10), secureRandom.nextInt(10), secureRandom.nextInt(10), secureRandom.nextInt(10),material, forma);
    }




}
