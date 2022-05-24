
package Service;

import Model.Skill;
import java.util.List;


public interface ISkillService {
    
    public List<Skill> getSkills();
    
    public void saveSkill(Skill ski);
    
    public void deleteSkill(Long id);
    
    public Skill getSkill(Long id);
    
}
