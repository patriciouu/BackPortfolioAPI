package Service;

import Model.Experiencia;
import Repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {

    @Autowired
    private ExperienciaRepository expRepo;

    @Override
    public List<Experiencia> getExperiencias() {
        List<Experiencia> listExperiencias = expRepo.findAll();
        return listExperiencias;
    }

    @Override
    public void saveExperiencia(Experiencia exp) {
        expRepo.save(exp);
    }

    @Override
    public void deleteExperiencia(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public Experiencia getExperiencia(Long id) {
        Experiencia exp = expRepo.findById(id).orElse(null);
        return exp;
    }

    @Override
    public void editExperiencia(Experiencia exp) {
        expRepo.save(exp);

    }
}
