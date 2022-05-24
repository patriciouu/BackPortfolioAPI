
package com.portfolioAPI.portfolio.Controller;

import com.portfolioAPI.portfolio.Model.Experiencia;
import com.portfolioAPI.portfolio.Service.ExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/portfolio") //Prueba de conexión con el front
public class ExperienciaController {
    
    @Autowired
    private ExperienciaService interExp;
    
    @GetMapping("/experiencia")
    private List<Experiencia> returnExperiencias(){
        return interExp.getExperiencias();
    }
    
    @PostMapping("/experiencia/create")
    private void createExperiencia(@RequestBody Experiencia exp){
        interExp.saveExperiencia(exp);
}
    
    @PutMapping("/experiencia/edit/{id}")
    private void editExperiencia(@PathVariable Long id,
            @RequestBody Experiencia exp){
        interExp.saveExperiencia(exp);
    }
    
    @DeleteMapping("/experiencia/delete/{id}")
    private void deleteExperencia(@PathVariable Long id){
        interExp.deleteExperiencia(id);
    }
    
}
