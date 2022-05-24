
package Controller;

import Model.Educacion;
import Service.EducacionService;
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
@CrossOrigin(origins = "https://portfolioargprogpo.web.app/")
@RequestMapping("/portfolio")
public class EducacionController {
    
    @Autowired
    private EducacionService interEdu;
    
    @GetMapping("/educacion")
    private List<Educacion> returnEducacionList(){
        
        return interEdu.getEducacionList();
}
    
    @PostMapping("educacion/create")
    private void createEducacion(@RequestBody Educacion edu){
        interEdu.saveEducacion(edu);
    }
    
    @DeleteMapping("educacion/delete/{id}")
    private void deleteEducacion(@PathVariable Long id){
        interEdu.deleteEducacion(id);
    }
    
    @PutMapping("educacion/edit/{id}")
    private void editEducacion(@PathVariable Long id,
            @RequestBody Educacion edu){
        interEdu.saveEducacion(edu);
    }
    
}
