package tknika.cloud.ejercicio102.dominio;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Clase {

    private String id;
    private List<Alumno> alumnos;
    private Profesor tutor;

    public Clase(String id, Profesor tutor)
    {
        this.id = id;
        this.tutor = tutor;
        this.alumnos = new ArrayList<Alumno>();
    }
    
}
