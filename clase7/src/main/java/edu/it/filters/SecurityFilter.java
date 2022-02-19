package edu.it.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.log4j.Logger;

public class SecurityFilter implements Filter {
	Logger logger = Logger.getLogger(getClass());
	
	public void doFilter(ServletRequest request, ServletResponse response, 
			FilterChain chain)
			throws IOException, ServletException {
		
		logger.info("Estoy en el filtro security filter");
		/*
		 * Tengo 2 alternativas, o respondo algo
		 * Generalemente tiene que ver con hecharlo del api, al usuario
		 * porque no cumple algun requisito de seguridad
		 * 
		 * Por otra parte, esta forma, es el patron de diseño chain of responsability
		 * Si quiero patear la pelota para el siguiente filtro ?
		 * entonces tengo que hacer lo que dice abajo
		 */
		logger.info("Pateando la pelota al siguiente filtro");
		chain.doFilter(request, response);
	}

}
