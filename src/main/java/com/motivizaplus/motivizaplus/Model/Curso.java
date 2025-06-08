package com.motivizaplus.motivizaplus.Model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Curso {
    
    private long id_curso;
    private String nombre;
    private String descripcion;
    private String docente;
    private String aula;
}