package com.motivizaplus.motivizaplus.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlumnoController {

    @GetMapping("/inicio")
    public String mostrarInicio() {
        return "inicio"; // Carga el archivo inicio.html desde /templates
    }
}

