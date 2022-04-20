package org.instituto152;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	String nombre;
	Aula aula;
	Profesor profesor;
	List<Alumno> alumnos = new ArrayList<Alumno>();;
	
	@Override
	public String toString() {
		return "La asignatura " + nombre + " se dicta en el aula " + aula + ", su profesor es " + profesor
				+ " y los alumnos son " + alumnos.toString();
	}
}
