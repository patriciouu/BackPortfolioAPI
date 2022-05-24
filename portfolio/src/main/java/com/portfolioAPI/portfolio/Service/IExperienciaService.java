
package com.portfolioAPI.portfolio.Service;

import com.portfolioAPI.portfolio.Model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
    public List<Experiencia> getExperiencias();
    
    public void saveExperiencia(Experiencia exp);
    
    public void deleteExperiencia(Long id);
    
    public Experiencia getExperiencia(Long id);
    
    public void editExperiencia(Experiencia exp);
    
}
