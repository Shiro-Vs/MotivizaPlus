package Service;
import org.springframework.stereotype.Service;

@Service
public class CursoService {
    private final CursoService cursoService;

    public CursoService(CursoService cursoService) {
        this.cursoService = cursoService;
    }
}