package edu.it.ejemplos;

interface TipoOperacion {
   Integer operar(Integer x, Integer y);
}

interface Operacion {
   Integer operar(Integer x, Integer y, TipoOperacion tipoOp);
}

public class Composicion {
	public void run() {
		TipoOperacion dosXMenosy = (x, y) -> (2 * x) - y;
		TipoOperacion tresXMasY = (x, y) -> (3 * x) + y;
		
		Operacion oper = (x, y, t) -> t.operar(x, y);		
		
		Integer resultado = oper.operar(10, 5, tresXMasY);
		System.out.println("Composicion: " + resultado);
	}
}
