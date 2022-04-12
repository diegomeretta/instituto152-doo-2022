package org.instituto152;

import java.util.Vector;

public class Instituto {

	Integer numero;
	String calle;
	String ciudad;
	String provincia;
	
	Vector<Persona> personas = new Vector<Persona>();
	
	
	public Instituto(Integer numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return "{Instituto:{ Número:" + numero + ", Calle:" + calle
				+ ", Ciudad:" + ciudad + ", Provincia:" + provincia + "}}";
	}
	
	void agregarPersona(Persona persona) {
		personas.add(persona);
	}
}
