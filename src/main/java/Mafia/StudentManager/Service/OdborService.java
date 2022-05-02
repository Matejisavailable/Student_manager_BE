package Mafia.StudentManager.Service;

import Mafia.StudentManager.DTO.OdborDTO;
import Mafia.StudentManager.Model.Odbor;
import Mafia.StudentManager.Repository.OdborRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.LinkedList;
import java.util.List;

@Service
public class OdborService {
    private final OdborRepository odborRepository;
    public OdborService(OdborRepository odborRepository){
        this.odborRepository = odborRepository;

    }
    private static OdborDTO mapOdborDTO(Odbor odbor){
        OdborDTO odborDTO = new OdborDTO();
        odborDTO.setId(odbor.getId());
        odborDTO.setNazov(odbor.getNazov());
        odborDTO.setKonzultant(odbor.getKonzultant());
        return odborDTO;
    }
    @Transactional
    public List<OdborDTO> getOdbors(Long id) {
        List<OdborDTO> odbory = new LinkedList<>();
        for (Odbor o1 : odborRepository.findAll()) {
            OdborDTO o2 = mapOdborDTO(o1);
            odbory.add(o2);
        }
        return odbory;
    }
}
