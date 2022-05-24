
package com.portfolioAPI.portfolio.Controller;

import com.portfolioAPI.portfolio.Model.Persona;
import com.portfolioAPI.portfolio.Service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/portfolio")
public class PersonaController {

    @Autowired
    private PersonaService interPerso;

    @GetMapping("/persona")
    public List<Persona> returnPersonas() {
        return interPerso.getPersonas();
    }

    @PutMapping("/persona/edit/{id}")
    public void editPersona(@PathVariable Long id,
            @RequestBody Persona perso){
        interPerso.savePersona(perso);
    }    
}
