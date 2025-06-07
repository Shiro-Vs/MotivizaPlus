package Service;

import org.springframework.stereotype.Service;

@Service
public class Usuario {
    private final Usuario usuarioService;
    public Usuario(Usuario usuarioService) {
        this.usuarioService = usuarioService;
    }
    
}
