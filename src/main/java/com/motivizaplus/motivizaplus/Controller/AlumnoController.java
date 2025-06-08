package com.motivizaplus.motivizaplus.Controller;

import com.motivizaplus.motivizaplus.Model.Alumno;
import com.motivizaplus.motivizaplus.Service.AlumnoService;
import com.motivizaplus.motivizaplus.Service.CursoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService; // <- Falta esto

    @Autowired
    private CursoService cursoService;

    @PostMapping("/login")
    public String login(@RequestParam("correo") String correo,
                        @RequestParam("password") String password,
                        Model model) {

        Alumno alumno = alumnoService.verificarCredenciales(correo, password);

        if (alumno != null) {
            model.addAttribute("alumno", alumno);
            model.addAttribute("cursos", cursoService.obtenerCursos());
            return "inicio"; // Pasamos lista de cursos al inicio.html
        } else {
            model.addAttribute("error", "Correo o contraseña incorrectos");
            return "index";
        }
    }
}

