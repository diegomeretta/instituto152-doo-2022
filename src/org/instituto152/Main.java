package org.instituto152;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {

		Instituto instituto152 = new Instituto(152);
		
		Profesor diego = new Profesor();
		diego.nombre = "Diego";
		diego.telefono = "2244-123456";
		diego.sueldo = new BigDecimal(100);
		
		System.out.println(instituto152.toString());
		System.out.println(diego.toString());
	}

}
