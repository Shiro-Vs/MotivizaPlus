package com.motivizaplus.motivizaplus.Model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Calendario {
    
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private long id_calendario;
    
    private String titulo;
    private String descripcion;
    private Date fecha_inicio;
    private Date fecha_fin;
    private String tipo;
    private String estado;
}
