package org.formacion.observer;

import java.util.LinkedHashSet;
import java.util.Set;

public class ServicioMatriculacion {
	
	// Para no permitir observer duplicados
	private Set<NuevaMatriculaObserver> observers = new LinkedHashSet<>();
	
	public void registra (NuevaMatriculaObserver observer) {
		observers.add(observer);
	}
	
	public void alta (Matricula nueva) {
		System.out.printf("Creando nueva matrícula de %s para %s. \n", nueva.getCurso(), nueva.getAlumno());
		
		// El obj observado
		for (NuevaMatriculaObserver observer: observers) {
			observer.nueva(nueva);
		}
	}

}
