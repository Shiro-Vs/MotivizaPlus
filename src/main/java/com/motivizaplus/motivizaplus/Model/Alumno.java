package com.motivizaplus.motivizaplus.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Alumno {

    private String nombre;
    private String apellido;
    private String correo;
    private String password;
    
}
