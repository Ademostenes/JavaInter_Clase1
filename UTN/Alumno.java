package UTN;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

    private String nombre;
    private String apellido;
    private String dni;
    List<Materia> aprobadas;

    public Alumno(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.aprobadas = new ArrayList<>();
    }

    public void agregarAprobada(Materia materia) {
        aprobadas.add(materia);
    }

}
