package com.motivizaplus.motivizaplus.Model;
import java.time.LocalDate;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;


@Entity
@AllArgsConstructor
public class ActividadCompletada {
    private String idActividad;
    private LocalDate fechaCompletada;
    private float calificacion;
    
}
