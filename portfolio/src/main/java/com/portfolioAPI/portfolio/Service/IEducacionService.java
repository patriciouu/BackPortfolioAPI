package com.portfolioAPI.portfolio.Service;

import com.portfolioAPI.portfolio.Model.Educacion;
import java.util.List;

public interface IEducacionService {

    public List<Educacion> getEducacionList();

    public void saveEducacion(Educacion edu);

    public void deleteEducacion(Long id);

    public Educacion getEducacion(Long id);

}
