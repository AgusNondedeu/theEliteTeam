package edu.it.ejemplos;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

class ResultadoOK {
	public final String status;
	public final Object resultado;
	
	public ResultadoOK(Object resultado) {
		this.status = "OK";
		this.resultado = resultado;
	}
}

class ResultadoError {
	public final String status;
	public final String motivoError;
	
	public ResultadoError(String motivoError) {
		this.status = "ERROR";
		this.motivoError = motivoError;
	}
}

interface Ejecutable {
	Object run();
}

public class ManejoDeErrores {
	Logger l = LoggerFactory.getLogger(getClass());
	private Object controlaPosiblesErrores(Ejecutable exec) {
		try {
			return new ResultadoOK(exec.run());
		}
		catch (Exception ex) {
			l.error("Se produjo un error al intenentar ejecutar");
			l.error("Voy a armar un objeto de error");
			return new ResultadoError(ex.getMessage());
		}
	}
	public void run() {
		Object objeto = controlaPosiblesErrores(() -> {
			Scanner scn = new Scanner(System.in);
			System.out.println("Quiere generar un error ?");
			String linea = scn.nextLine();
			if (linea.equalsIgnoreCase("s")) {
				throw new RuntimeException("Aca el mensje lo pone el que arroja el error");
			}
			String s1 = null; // String sin inicializar
			String s2 = "HOLA";
			s2 = s1;
			
			s1.concat("amigo");
			return "SI ANDUVO BIEN";
		});
		
		l.info("Una vez fuera de las funciones que trabajan en conjunto");
		l.info("Voy a revisar el resultado de la operacion");
		l.info(new Gson().toJson(objeto));
	}
}
