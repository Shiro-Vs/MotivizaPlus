package com.motivizaplus.motivizaplus.Service;

import org.springframework.stereotype.Service;

@Service
public class ActividadCompletadaService {
    private final ActividadCompletadaService actividadCompletadaService;

    public ActividadCompletadaService(ActividadCompletadaService actividadCompletadaService) {
        this.actividadCompletadaService = actividadCompletadaService;
    }   
}
