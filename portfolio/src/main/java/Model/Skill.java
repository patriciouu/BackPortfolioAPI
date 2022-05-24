
package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Skill {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long skillId;
    private String skillNombre;
    private int skillProgreso;

    public Skill() {
    }

    public Skill(Long skillId, String skillNombre, int skillProgreso) {
        this.skillId = skillId;
        this.skillNombre = skillNombre;
        this.skillProgreso = skillProgreso;
    }
    
    
}
