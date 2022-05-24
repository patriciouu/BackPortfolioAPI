
package com.portfolioAPI.portfolio.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String titulo;
    private String acercaDe;
    private String fotoDePerfil;
    private String banner;

    public Persona() {
    }

    public Persona(Long id, String nombre, String acercaDe, String fotoDePerfil) {
        this.id = id;
        this.nombre = nombre;
        this.titulo = titulo;
        this.acercaDe = acercaDe;
        this.fotoDePerfil = fotoDePerfil;
        this.banner = banner;
    }
    
}
