package tknika.cloud.ejercicio102.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {

    private String id;
    private String nombre;
    private int anoNacimiento;
    
}
