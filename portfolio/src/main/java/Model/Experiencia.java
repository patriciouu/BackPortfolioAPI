
package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long idExperiencia;
    private String empresa;
    private int periodo;
    private int periodoFin;
    private String puesto;
    private String logoEmpresa;

    public Experiencia() {
    }

    public Experiencia(Long idExperiencia, String empresa, int periodo, int periodoFin, String puesto, String logoEmpresa) {
        this.idExperiencia = idExperiencia;
        this.empresa = empresa;
        this.periodo = periodo;
        this.periodoFin = periodoFin;
        this.puesto = puesto;
        this.logoEmpresa = logoEmpresa;
    }
    
    
}
