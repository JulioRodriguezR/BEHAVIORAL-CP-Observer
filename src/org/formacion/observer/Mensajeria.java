package org.formacion.observer;

public class Mensajeria implements NuevaMatriculaObserver {

	@Override
	public void nueva (Matricula nueva) {
		System.out.printf("New email: Welcome %s", nueva.getAlumno(), nueva.getCurso());
	}
	
}
