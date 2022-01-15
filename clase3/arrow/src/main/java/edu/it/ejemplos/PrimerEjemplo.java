package edu.it.ejemplos;

public class PrimerEjemplo {
	public void run() {
		/*
		 * Arrow functions
		 */
		
		java.util.function.BiFunction<Integer, Integer, Integer> suma = (Integer x, Integer y) -> {
			System.out.println("Estoy en la funcion suma, voy a sumar " + x + " + " + y);
			return x + y;
		};
		
		java.util.function.BiFunction<Integer, Integer, Integer> suma2 = (x, y) -> {
			System.out.println("Estoy en la funcion suma, voy a sumar " + x + " + " + y);
			return x + y;
		};
		
		java.util.function.BiFunction<Integer, Integer, Integer> suma3 = (x, y) -> {
			return x + y;
		};
		
		java.util.function.BiFunction<Integer, Integer, Integer> suma4 = (x, y) -> x + y;
		
		var total = suma4.apply(55, 45);
		System.out.println("Resultado de la suma: " + total);
	
		
		
	}
}
