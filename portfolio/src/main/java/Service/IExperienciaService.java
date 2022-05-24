
package Service;

import Model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
    public List<Experiencia> getExperiencias();
    
    public void saveExperiencia(Experiencia exp);
    
    public void deleteExperiencia(Long id);
    
    public Experiencia getExperiencia(Long id);
    
    public void editExperiencia(Experiencia exp);
    
}
