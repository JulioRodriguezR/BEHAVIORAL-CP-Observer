package org.formacion.observer;

public class Matricula {

	private String alumno;
	private String curso;
	
	public Matricula (String alumno, String curso) {
		this.alumno = alumno;
		this.curso = curso;
	}
	
	public String getAlumno() {
		return alumno;
	}
	
	public String getCurso() {
		return curso;
	}
}
