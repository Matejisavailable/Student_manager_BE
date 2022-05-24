package Mafia.StudentManager.Controller;
import Mafia.StudentManager.DTO.OdborDTO;
import Mafia.StudentManager.Service.OdborService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("/odbor")
@RestController
public class OdborController {
    private final OdborService odborService;

    public OdborController(OdborService odborService) {
        this.odborService = odborService;
    }

    @GetMapping("/all")
    public List<OdborDTO> getOdbors(@RequestParam(required = false) Long id){
        return odborService.getOdbors(id);
    }
}
