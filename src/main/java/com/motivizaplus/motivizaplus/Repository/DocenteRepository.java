package com.motivizaplus.motivizaplus.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.motivizaplus.motivizaplus.Model.Docente;

public interface DocenteRepository extends  JpaRepository <Docente, Long> {
  
}
