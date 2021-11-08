package org.formacion.observer;

public class Demo {

	public static void main(String[] args) {
		new Matricula("Antonio", "Informática");
		ServicioMatriculacion matriculador = new ServicioMatriculacion();
		
		matriculador.registra(new Mensajeria());
		//matriculador.registra(new ServicioAlumnado());
	}

}
