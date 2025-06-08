package com.motivizaplus.motivizaplus.Service;

import com.motivizaplus.motivizaplus.Model.Curso;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CursoService {

    private List<Curso> cursos = new ArrayList<>();

    public CursoService() {
        cursos.add(new Curso(1, "Integrador", "Curso integrador de varias áreas", "Ing. Pérez", "301"));
        cursos.add(new Curso(2, "Matemáticas Avanzadas", "Cálculo y álgebra", "Dra. Gómez", "205"));
        cursos.add(new Curso(3, "Programación Java", "Introducción a Java y POO", "Ing. Ruiz", "102"));
        cursos.add(new Curso(4, "Base de Datos", "Modelado y SQL", "Ing. Torres", "207"));
        cursos.add(new Curso(5, "Redes de Computadoras", "Fundamentos de redes", "Ing. Castillo", "403"));
    }

    public List<Curso> obtenerCursos() {
        return cursos;
    }
}
