
package com.portfolioAPI.portfolio.Controller;

import com.portfolioAPI.portfolio.Model.Proyecto;
import com.portfolioAPI.portfolio.Service.ProyectoService;
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
@RequestMapping("/portfolio")
public class ProyectoController {
    
    @Autowired
    private ProyectoService interProye;
    
    @GetMapping("/proyectos")
    private List <Proyecto> returnProyectosList(){
        return interProye.getProyectos();
    }
    
    @PostMapping("/proyectos/create")
    private void createProyecto(@RequestBody Proyecto proye){
        interProye.saveProyecto(proye);
    }
    
    @PutMapping("/proyectos/edit/{id}")
    private void editProyecto(@PathVariable Long id,
            @RequestBody Proyecto proye){
        interProye.saveProyecto(proye);
    }
    
    @DeleteMapping("/proyectos/delete/{id}")
    private void deleteProyecto(@PathVariable Long id){
        interProye.deleteProyecto(id);
    }
    
    
    
}
