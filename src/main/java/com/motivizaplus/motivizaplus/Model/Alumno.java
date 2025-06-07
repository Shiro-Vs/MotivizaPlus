package com.motivizaplus.motivizaplus.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Alumno {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private long id_alumno;
    
    private String nombre;
    private String apellido;
    private String correo;
    private String password;
    private String ciclo;
    private String carrera;
    
}
