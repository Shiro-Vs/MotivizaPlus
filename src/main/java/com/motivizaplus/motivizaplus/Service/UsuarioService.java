package com.motivizaplus.motivizaplus.Service;

import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    private final UsuarioService usuarioService;
    public UsuarioService(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    
}
