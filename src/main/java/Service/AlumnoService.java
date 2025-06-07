package Service;
import org.springframework.stereotype.Service;

@Service
public class AlumnoService {
    private final AlumnoService alumnoService;   

    public AlumnoService(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }
    
}
