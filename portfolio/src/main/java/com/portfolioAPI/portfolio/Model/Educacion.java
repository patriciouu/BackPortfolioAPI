
package com.portfolioAPI.portfolio.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter @Setter
public class Educacion {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long educacionId;
    private String instituto;
    private int periodo;
    private int periodoFin;
    private String carrera;
    private String logoEducacion;

    public Educacion() {
    }

    public Educacion(Long educacionId, String instituto, int periodo, int periodoFin, String carrera, String logoEducacion) {
        this.educacionId = educacionId;
        this.instituto = instituto;
        this.periodo = periodo;
        this.periodoFin = periodoFin;
        this.carrera = carrera;
        this.logoEducacion = logoEducacion;
    }
    
    
        
}
