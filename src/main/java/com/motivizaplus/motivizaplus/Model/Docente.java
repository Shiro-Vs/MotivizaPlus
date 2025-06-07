package com.motivizaplus.motivizaplus.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;

@Entity
@EqualsAndHashCode(callSuper = true)
public class Docente extends Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id_docente;

    private String especialidad;

}