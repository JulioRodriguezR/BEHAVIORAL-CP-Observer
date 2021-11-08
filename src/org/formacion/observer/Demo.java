package org.formacion.observer;

public class Demo {

	public static void main(String[] args) {
		ServicioMatriculacion matriculador = new ServicioMatriculacion();
		
		matriculador.registra(new Mensajeria());
		matriculador.alta(new Matricula("Antonio", "Informática"));
	}

}
