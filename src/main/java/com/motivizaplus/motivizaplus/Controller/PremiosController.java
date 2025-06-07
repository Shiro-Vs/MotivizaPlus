package com.motivizaplus.motivizaplus.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PremiosController {

    @GetMapping("/premios")
    public String mostrarPremios() {
        return "premios";
    }
}