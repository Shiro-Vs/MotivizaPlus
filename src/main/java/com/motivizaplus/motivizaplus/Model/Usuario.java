package com.motivizaplus.motivizaplus.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Usuario {

    private String nombre;
    private String apellido;
    private String email;
    private String password;

}