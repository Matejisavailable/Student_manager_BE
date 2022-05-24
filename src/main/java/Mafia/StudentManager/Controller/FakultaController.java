package Mafia.StudentManager.Controller;

import Mafia.StudentManager.DTO.FakultaDTO;
import Mafia.StudentManager.DTO.OdborDTO;
import Mafia.StudentManager.Service.FakultaService;
import Mafia.StudentManager.Service.OdborService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/fakulta")
@RestController

public class FakultaController {
    private final FakultaService fakultaService;

    public FakultaController(FakultaService fakultaService) {
        this.fakultaService = fakultaService;
    }

    @GetMapping("/all")
    public List<FakultaDTO> getFakulty(@RequestParam(required = false) Long id){
        return fakultaService.getFakulty(id);
    }
}
