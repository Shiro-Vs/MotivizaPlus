package com.motivizaplus.motivizaplus.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Docente extends Usuario {

    private String id_docente;
    private String especialidad;
    
}