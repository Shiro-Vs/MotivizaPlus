package com.motivizaplus.motivizaplus.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalendarioController {
    
    @GetMapping("/calendario")
    public String mostrarInicio() {
        return "calendario"; 
    }
    
}
