package com.motivizaplus.motivizaplus.Model;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;


@Entity
@AllArgsConstructor
public class ActividadCompletada {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private String idActividad;
    private LocalDate fechaCompletada;
    private float calificacion;
    
}
