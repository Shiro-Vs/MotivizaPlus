package com.motivizaplus.motivizaplus.Repository;
import com.motivizaplus.motivizaplus.Model.Docente;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface DocenteRepository extends JpaRepository<Docente, String> {
    Optional<Docente> findByCorreoAndPassword(String email, String password);
}
