package edu.it.ejemplos;

import java.util.HashMap;

import com.google.gson.Gson;

public class SegundoEjemplo {
	public void run() {
		java.util.function.Consumer<String> print = x -> {
			System.out.println(x);
		};
		
		java.util.function.Function<Object, String> toJson = z -> new Gson().toJson(z);
		
		java.util.function.BiConsumer<String, Integer> cons = (s, i) -> {
			HashMap<String, Integer> mapa = new HashMap<String, Integer>();
			mapa.put(s, i);
			print.accept(toJson.apply(mapa));
		};
		
		cons.accept("valor", 55);
		cons.accept("OK", 200);
		cons.accept("Resultado", 200);
	}
}
