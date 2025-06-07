package Service;
import org.springframework.stereotype.Service;
@Service
public class DocenteService {

    private final DocenteService docenteService;
    public DocenteService(DocenteService docenteService) {
        this.docenteService = docenteService;
    }
    
}
