package Mafia.StudentManager.Controller;

import Mafia.StudentManager.DTO.KatedraDTO;
import Mafia.StudentManager.DTO.OdborDTO;
import Mafia.StudentManager.Service.KatedraService;
import Mafia.StudentManager.Service.OdborService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class KatedraController {
    private final KatedraService katedraService;

    public KatedraController(KatedraService katedraService) {
        this.katedraService = katedraService;
    }

    @GetMapping("/all")
    public List<KatedraDTO> getKatedras(@RequestParam(required = false) Long id){
        return katedraService.getKatedry(id);
    }
}
