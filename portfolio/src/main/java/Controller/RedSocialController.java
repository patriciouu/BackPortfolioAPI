
package Controller;

import Model.RedSocial;
import Service.RedSocialService;
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
public class RedSocialController {
    
    @Autowired
    private RedSocialService interRed;
    
    @GetMapping("/redes")
    private List<RedSocial> returnRedes(){
        return interRed.getRedes();
    }
    
    @PostMapping("/redes/create")
    private void createRed(@RequestBody RedSocial red){
        interRed.saveRed(red);
    }
    
    @PutMapping("/redes/edit/{id}")
    private void editRed(@PathVariable Long id,
            @RequestBody RedSocial red){
        interRed.saveRed(red);
    }
    
    @DeleteMapping("/redes/delete/{id}")
    private void deleteRed(@PathVariable Long id){
        interRed.deleteRed(id);
    }
       
}
