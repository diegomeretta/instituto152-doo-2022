package org.instituto152;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {

		Instituto instituto152 = new Instituto(152);
		
		Profesor diego = new Profesor();
		diego.nombre = "Diego";
		diego.telefono = "2244-123456";
		diego.sueldo = new BigDecimal(100);
		
		Alumno alumno1 = new Alumno();
		alumno1.nombre = "Nombre Alumno1";
		alumno1.promedio = new BigDecimal(9);

		Alumno alumno2 = new Alumno();
		alumno2.nombre = "Nombre Alumno2";
		alumno2.promedio = new BigDecimal(8);

		Curso curso = new Curso();
		curso.nombre = "DESARROLLO DE SISTEMAS ORIENTADO A OBJETOS";
		
		curso.profesor = diego;
		curso.alumnos.add(alumno1);
		curso.alumnos.add(alumno2);
		
		System.out.println(instituto152.toString());
		System.out.println(curso.toString());
		
		System.out.println("Suma:" + Ayuda.sumar(7, 8));
	}

}
