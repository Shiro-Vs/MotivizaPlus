package com.motivizaplus.motivizaplus.Service;

import org.springframework.stereotype.Service;

@Service
public class ActividadService {

    private final ActividadService actividadService;

    public ActividadService(ActividadService actividadService) {
        this.actividadService = actividadService;
    }
    
}
