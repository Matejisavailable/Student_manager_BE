package Mafia.StudentManager.Service;
import Mafia.StudentManager.DTO.KatedraDTO;
import Mafia.StudentManager.Model.Katedra;
import Mafia.StudentManager.Repository.KatedraRepository;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.LinkedList;
import java.util.List;
@Service
public class KatedraService {
        private final KatedraRepository katedraRepository;
        public KatedraService(KatedraRepository katedraRepository){
            this.katedraRepository = katedraRepository;
        }
        private static KatedraDTO mapKatedraDTO(Katedra katedra){
            KatedraDTO katedraDTO = new KatedraDTO();
            katedraDTO.setId(katedra.getId());
            katedraDTO.setNazov(katedra.getNazov());
            katedraDTO.setVeduci(katedra.getVedudci());
            return katedraDTO;
        }
        @Transactional
        public List<KatedraDTO> getKatedry(Long id) {
            List<KatedraDTO> katedry = new LinkedList<>();
            for (Katedra k1 : katedraRepository.findAll()) {
                KatedraDTO k2 = mapKatedraDTO(k1);
                katedry.add(k2);
            }
            return katedry;
        }
}
