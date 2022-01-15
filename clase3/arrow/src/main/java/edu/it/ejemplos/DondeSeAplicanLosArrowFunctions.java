package edu.it.ejemplos;

@FunctionalInterface
interface Saludo {
	void saludar(String mensaje);
}

public class DondeSeAplicanLosArrowFunctions {
	public void run() {
		/*
		 * Los arrow functions solo se pueden aplicar en aquellas interfaces
		 * que solo tienen un metodo
		 */
		Saludo z = m -> System.out.println(m);
		
		z.saludar("Hola que tal, soy el profe de arrow functions");
	}
}
