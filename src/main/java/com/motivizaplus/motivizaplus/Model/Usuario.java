package com.motivizaplus.motivizaplus.Model;

import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;

@Entity
@NoArgsConstructor
public class Usuario {

    private String nombre;
    private String apellido;
    private String email;
    private String password;

}