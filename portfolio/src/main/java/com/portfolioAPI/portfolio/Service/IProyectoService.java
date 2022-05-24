
package com.portfolioAPI.portfolio.Service;

import com.portfolioAPI.portfolio.Model.Proyecto;
import java.util.List;


public interface IProyectoService {
    
    public List<Proyecto> getProyectos();
    
    public void saveProyecto(Proyecto proye);
    
    public void deleteProyecto(Long id);
    
    public Proyecto getProyecto(Long id);
    
}
