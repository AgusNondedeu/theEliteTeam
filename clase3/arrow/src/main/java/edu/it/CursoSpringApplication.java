package edu.it;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import edu.it.ejemplos.TercerEjemplo;

@SpringBootApplication
@EnableAspectJAutoProxy
public class CursoSpringApplication {
	public static void main(String[] args) {
		new TercerEjemplo().run();
	}
}
