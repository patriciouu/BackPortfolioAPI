
package Controller;

import Model.Skill;
import Service.SkillService;
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
public class SkillController {
    
    @Autowired
    private SkillService interSkill;
    
    @GetMapping("/skills")
    private List<Skill> returnSkills(){
        return interSkill.getSkills();
    }
    
    @PostMapping("/skills/create")
    private void createSkill(@RequestBody Skill ski){
        interSkill.saveSkill(ski);
    }
    
    @PutMapping("/skills/edit/{id}")
    private void editSkill(@PathVariable Long id,
            @RequestBody Skill ski){
        interSkill.saveSkill(ski);
    }
    
    @DeleteMapping("skills/delete/{id}")
    private void deleteSkill(@PathVariable Long id){
        interSkill.deleteSkill(id);
    }
    
}
