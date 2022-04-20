package org.instituto152;

import java.math.BigDecimal;

public class Alumno extends Persona {

	Integer numeroEstudiante;
	BigDecimal promedio;
	
	public void inscribirEnCurso() {
		
	}
	
	@Override
	public String toString() {
		return super.toString() + "{numeroEstudiante:" + numeroEstudiante + ", promedio:" + promedio + "}";
	}
}
