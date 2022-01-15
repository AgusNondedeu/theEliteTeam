package edu.it;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import edu.it.ejemplos.DondeSeAplicanLosArrowFunctions;

@SpringBootApplication
@EnableAspectJAutoProxy
public class CursoSpringApplication {
	public static void main(String[] args) {
		new DondeSeAplicanLosArrowFunctions().run();
	}
}
