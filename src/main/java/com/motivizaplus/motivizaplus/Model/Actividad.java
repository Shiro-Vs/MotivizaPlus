package com.motivizaplus.motivizaplus.Model;
import java.time.LocalDate;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Entity
public class Actividad {
    private String idActividadd;
    private String nombre;
    private String tipo;
    private String descripcion;
    private int puntos;
    private LocalDate fechaEntrega;

}
