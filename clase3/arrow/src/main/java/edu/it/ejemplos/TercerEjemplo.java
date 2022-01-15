package edu.it.ejemplos;

import java.util.Scanner;
import java.util.function.Consumer;

public class TercerEjemplo {
	private void invierteElControl(Integer cantIteraciones, Consumer<Integer> cons) {
		System.out.println("Voy a tomar el control de la situacion");
		System.out.println("Quiere ejecutar el proceso ???? " + cantIteraciones + " veces");
		Scanner scn = new Scanner(System.in);
		String linea = scn.nextLine();
		if (linea.equalsIgnoreCase("s")) {
			for (int z = 0; z < cantIteraciones; z++) {
				cons.accept(z);
			}
		}
	}
	public void run() {
		/*
		 * Inversion de control
		 */
		
		invierteElControl(10, z -> {
			System.out.println("Voy a mostrar z al cuadrado");
			System.out.println(z * z);
		});		
	}
}
