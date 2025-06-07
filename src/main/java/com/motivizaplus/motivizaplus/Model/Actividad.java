package com.motivizaplus.motivizaplus.Model;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Entity
public class Actividad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idActividadd;

    private String nombre;
    private String tipo;
    private String descripcion;
    private int puntos;
    private LocalDate fechaEntrega;

}
