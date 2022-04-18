package org.instituto152;

public abstract class Persona {

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
