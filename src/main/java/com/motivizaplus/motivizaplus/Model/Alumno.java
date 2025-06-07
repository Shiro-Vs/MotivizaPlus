package com.motivizaplus.motivizaplus.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id_alumno;
    private String nombre;
    private String apellido;
    private String correo;
    private String password;
    private String ciclo;
    private String carrera;
    
}
