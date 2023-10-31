package UTN;

import java.util.ArrayList;
import java.util.List;

public class ejec {

	public static void main(String[] args) {
		// Creamos un alumno
		Alumno alumno = new Alumno("Juan", "Perez", "12345678");
		List<Materia>correlativa = new ArrayList<>();

		// Creamos una materia
		Materia materia = new Materia("INF-300", "Python para zoquetes");
		Materia materia2 = new Materia ("INF-200", "Progr. Orien.Objetos");
		Materia materia3 = new Materia ("MAT-100", "Analisis Matematico I");
		
		correlativa.add(0, materia2);//Si quitamos (O comentamos) ésta y la siguiente linea, se podrá inscribir
		correlativa.add(1,materia3);// Ver arriba.
		
		materia.setCorrelativas(correlativa); //Comentar o quitar ésta linea, en caso de hacer lo mismo con las dos anteriores.

		// Asignamos la materia al alumno
		alumno.agregarAprobada(materia);

		// Creamos una inscripción
		Inscripcion inscripcion = new Inscripcion(1L, alumno, materia);

		// Verificamos si la inscripción está aprobada
		System.out.println(inscripcion.aprobada()); // true
		if (!inscripcion.aprobada()) {
			List<Materia> listaCorrelativas = materia.getCorrelativas();
			System.out.println("Falta aprobar las siguientes materias correlativas:");
			System.out.println();
		   for (int x = 0; x < listaCorrelativas.size(); x++) {
			   Materia corr = listaCorrelativas.get(x);
			   System.out.println(x+1 + "- " + corr.getNombre());
		   }
		   System.out.println();
		   System.out.println("No es posible cursar la inscripcion a la materia " + materia.getNombre());
		} else {
			System.out.println("Inscripcion a materia " + materia.getNombre() + "  exitosa!");
		} 
	}

}
