package com.motivizaplus.motivizaplus.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CursoController {
    
    @GetMapping("/cursos")
    public String mostrarCursos (){
        return "cursos";
    }
    
}
