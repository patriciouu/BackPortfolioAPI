
package Service;

import Model.Skill;
import Repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SkillService implements ISkillService {
    
    @Autowired
    private SkillRepository skillRepo;

    @Override
    public List<Skill> getSkills() {
        List<Skill> skillsList = skillRepo.findAll();
        return skillsList;
    }

    @Override
    public void saveSkill(Skill ski) {
        skillRepo.save(ski);
    }

    @Override
    public void deleteSkill(Long id) {
        skillRepo.deleteById(id);
    }

    @Override
    public Skill getSkill(Long id) {
        Skill ski = skillRepo.findById(id).orElse(null);
        return ski;
    }
    
}
