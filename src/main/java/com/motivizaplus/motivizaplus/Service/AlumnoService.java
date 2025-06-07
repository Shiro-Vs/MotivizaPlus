package com.motivizaplus.motivizaplus.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.motivizaplus.motivizaplus.Model.Alumno;
import com.motivizaplus.motivizaplus.Repository.AlumnoRepository;

@Service
public class AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    public Optional<Alumno> validarLogin(String correo, String password) {
        return alumnoRepository.findByCorreoAndPassword(correo, password);
    }
}
