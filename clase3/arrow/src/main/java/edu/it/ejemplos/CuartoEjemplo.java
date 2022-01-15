package edu.it.ejemplos;

import java.util.Scanner;
import java.util.function.Consumer;

public class CuartoEjemplo {
	private void invierteElControl(Consumer<Integer> cons) {
		System.out.println("Voy a tomar el control de la situacion");
		System.out.println("Quiere ejecutar el proceso ???? ");
		Scanner scn = new Scanner(System.in);
		String linea = scn.nextLine();
		if (linea.equalsIgnoreCase("s")) {
			System.out.println("que cantidad de iteraciones ");
			Integer cant = scn.nextInt();
			
			for (int z = 0; z < cant; z++) {
				cons.accept(z);
			}
		}
	}
	public void run() {
		/*
		 * Inversion de control
		 */
		
		invierteElControl(z -> {
			System.out.println("Voy a mostrar " + z + " al cuadrado");
			System.out.println(z * z);
		});		
	}
}
