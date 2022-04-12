package org.instituto152;

public class Persona {

	String nombre;
	String telefono;
	String correoElectronico;
	
	@Override
	public String toString() {
		return "{" + this.getClass().getSimpleName()
				+ ":{nombre:" + nombre + ", telefono:" + telefono
				+ ", correoElectronico:" + correoElectronico + "}}";
	}
}
