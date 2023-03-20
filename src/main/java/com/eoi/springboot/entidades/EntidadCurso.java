package com.eoi.springboot.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;
/**
 * The type Entidad usuario.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="curso")
public class EntidadCurso {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String name;
    private String nombreProfesor;
    private Integer numeroAlumnos;
    private Date fechaInicio;
    private Date fechaFin;

}


