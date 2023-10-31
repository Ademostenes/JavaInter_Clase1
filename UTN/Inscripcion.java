package UTN;

public class Inscripcion {

    private Long id;
    private Alumno alumno;
    private Materia materia;
    private boolean aprobada;

    public Inscripcion(Long id, Alumno alumno, Materia materia) {
        this.id = id;
        this.alumno = alumno;
        this.materia = materia;
    }

    public boolean aprobada() {
        return materia.correlativas.isEmpty() || alumno.aprobadas.containsAll(materia.correlativas);
    }

}