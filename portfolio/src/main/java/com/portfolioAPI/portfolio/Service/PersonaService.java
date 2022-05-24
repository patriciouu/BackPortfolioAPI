
package com.portfolioAPI.portfolio.Service;

import com.portfolioAPI.portfolio.Model.Persona;
import com.portfolioAPI.portfolio.Repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
    
    @Autowired
    private PersonaRepository persoRepo;

    @Override
    public List<Persona> getPersonas() {
        List<Persona> persoList = persoRepo.findAll();
        return persoList;
    }

    @Override
    public void savePersona(Persona perso) {
        persoRepo.save(perso);
    }

    @Override
    public void deletePersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona perso = persoRepo.findById(id).orElse(null);
        return perso;
    }

    @Override
    public void editPersona(Persona perso) {
        persoRepo.save(perso);
    }    
}
