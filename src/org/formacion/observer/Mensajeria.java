package org.formacion.observer;

public class Mensajeria implements NuevaMatriculaObserver {

	@Override
	public void nueva (Matricula nueva) {
		System.out.printf("Nuevo email: Bienvenido %s al curso de %s", nueva.getAlumno(), nueva.getCurso());
	}
	
}
