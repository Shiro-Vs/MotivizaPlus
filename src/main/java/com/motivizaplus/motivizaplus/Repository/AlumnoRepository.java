package com.motivizaplus.motivizaplus.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.motivizaplus.motivizaplus.Model.Alumno;

public interface AlumnoRepository extends JpaRepository <Alumno, String> {

    Optional<Alumno> findByCorreoAndPassword(String email, String password);

}
