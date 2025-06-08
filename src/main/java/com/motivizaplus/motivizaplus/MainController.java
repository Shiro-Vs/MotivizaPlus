package com.motivizaplus.motivizaplus;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("/")
    public String vistaIndex() {
        return "index";
    }

    @GetMapping("/inicio")
    public String vistaInicio() {
        return "inicio";
    }

    @GetMapping("/calendario")
    public String vistaCalendario() {
        return "calendario";
    }

    @GetMapping("/cursos")
    public String vistaCursos() {
        return "cursos";
    }

    @GetMapping("/premios")
    public String vistaPremios() {
        return "premios";
    }

}
