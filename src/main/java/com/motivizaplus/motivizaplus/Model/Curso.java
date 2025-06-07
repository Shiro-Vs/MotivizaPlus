package com.motivizaplus.motivizaplus.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Curso {
    
    private String id_curso;
    private String nombre;
    private String descripcion;
    private String ciclo;
    private String carrera;

}
