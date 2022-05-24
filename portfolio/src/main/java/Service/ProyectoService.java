
package Service;

import Model.Proyecto;
import Repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProyectoService implements IProyectoService {
    
    @Autowired
    private ProyectoRepository proyeRepo;

    @Override
    public List<Proyecto> getProyectos() {
        List<Proyecto> proyeList = proyeRepo.findAll();
        return proyeList;
    }

    @Override
    public void saveProyecto(Proyecto proye) {
        proyeRepo.save(proye);
    }

    @Override
    public void deleteProyecto(Long id) {
        proyeRepo.deleteById(id);
    }

    @Override
    public Proyecto getProyecto(Long id) {
        Proyecto proye = proyeRepo.findById(id).orElse(null);
        return proye;
    }
    
    
}
