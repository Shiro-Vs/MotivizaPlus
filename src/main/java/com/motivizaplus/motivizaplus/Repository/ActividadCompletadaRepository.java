package com.motivizaplus.motivizaplus.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.motivizaplus.motivizaplus.Model.ActividadCompletada;
public interface ActividadCompletadaRepository extends JpaRepository <ActividadCompletada, Long> {

    // Aquí puedes agregar métodos personalizados si es necesario
    // Por ejemplo, para encontrar actividades completadas por un alumno específico
    // List<ActividadCompletada> findByAlumnoId(Long alumnoId);
    
}
