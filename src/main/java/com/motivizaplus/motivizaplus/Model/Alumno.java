package com.motivizaplus.motivizaplus.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Alumno extends Usuario {

    private String id_alumno;
    private String ciclo;
    private String carrera;
    
}
