
package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long proyectoId;
    private String nombreProyecto;
    private String descripcionProyecto;
    private String imagenProyecto;
    private String urlProyecto;
    private int fecha;
     

    public Proyecto() {
    }

    public Proyecto(Long proyectoId, String nombreProyecto, String descripcionProyecto, String imagenProyecto, String urlProyecto, int fecha) {
        this.proyectoId = proyectoId;
        this.nombreProyecto = nombreProyecto;
        this.descripcionProyecto = descripcionProyecto;
        this.imagenProyecto = imagenProyecto;
        this.urlProyecto =  urlProyecto;
        this.fecha = fecha;
    }
    
        
}
