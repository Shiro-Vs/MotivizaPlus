package com.motivizaplus.motivizaplus.Controller;

import com.motivizaplus.motivizaplus.Service.CursoService;
import com.motivizaplus.motivizaplus.Model.Curso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping("/cursos")
    public String mostrarCursos(Model model) {
        List<Curso> cursos = cursoService.obtenerCursos();
        model.addAttribute("cursos", cursos);
        return "cursos"; // Puedes crear una vista cursos.html o integrar en inicio.html
    }
}
