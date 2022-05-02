package Mafia.StudentManager.Service;
import Mafia.StudentManager.DTO.FakultaDTO;
import Mafia.StudentManager.Model.Fakulta;
import Mafia.StudentManager.Repository.FakultaRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.LinkedList;
import java.util.List;

@Service
public class FakultaService {
    private final FakultaRepository fakultaRepository;

    public FakultaService(FakultaRepository fakultaRepository) {
        this.fakultaRepository = fakultaRepository;

    }

    private static FakultaDTO mapFakultaDTO(Fakulta fakulta) {
        FakultaDTO fakultaDTO = new FakultaDTO();
        fakultaDTO.setId(fakulta.getId());
        fakultaDTO.setNazov(fakulta.getNazov());
        fakultaDTO.setVeduci(fakulta.getVeduci());
        return fakultaDTO;
    }

    @Transactional
    public List<FakultaDTO> getFakulty(Long id) {
        List<FakultaDTO> fakulty = new LinkedList<>();
        for (Fakulta f1 : fakultaRepository.findAll()) {
            FakultaDTO f2 = mapFakultaDTO(f1);
            fakulty.add(f2);
        }
        return fakulty;
    }
}