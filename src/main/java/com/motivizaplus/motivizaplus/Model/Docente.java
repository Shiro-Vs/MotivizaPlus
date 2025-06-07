package com.motivizaplus.motivizaplus.Model;

import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = true)
public class Docente extends Usuario {

    private String id_docente;
    private String especialidad;
    
}