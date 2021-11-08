package org.formacion.observer;

public class ServicioMatriculacion {
	
	public void alta (Matricula nueva) {
		System.out.printf("%s - \n");
		
		new Mensajeria().enviaMensajeAlta(nueva.getAlumno(), nueva.getCurso());
		
		if (nueva.isPrimeraMatricula()) {
			new ServicioAlumno().nuevoAlumno(nueva.getAlumno());
		}
	}

}
