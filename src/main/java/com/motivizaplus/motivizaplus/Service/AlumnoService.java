package com.motivizaplus.motivizaplus.Service;

import com.motivizaplus.motivizaplus.Model.Alumno;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlumnoService {

    private List<Alumno> alumnos = new ArrayList<>();

    public AlumnoService() {
        // Simulando usuarios registrados
        alumnos.add(new Alumno("Juan", "Pérez", "juan@gmail.com", "1234"));
        alumnos.add(new Alumno("Ana", "Gómez", "ana@gmail.com", "abcd"));
    }

    public Alumno verificarCredenciales(String correo, String password) {
        for (Alumno a : alumnos) {
            if (a.getCorreo().equalsIgnoreCase(correo) && a.getPassword().equals(password)) {
                return a;
            }
        }
        return null;
    }
}
