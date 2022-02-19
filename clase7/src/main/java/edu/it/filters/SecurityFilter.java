package edu.it.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import edu.it.components.Utiles;
import edu.it.errores.UnauthorizedException;

public class SecurityFilter implements Filter {
	Logger logger = Logger.getLogger(getClass());
	
	private void verificarToken() {
		// Hay que verificar que el token sea TOKEN_20220219
		// si es ese ? no hago nada, return
		// de lo contrario
		throw new UnauthorizedException("El token no es correcto");
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, 
			FilterChain chain)
			throws IOException, ServletException {
		
		logger.info("Estoy en el filtro security filter");
		
		var reqHTTP = (HttpServletRequest)request;
		var resHTTP = (HttpServletResponse)response;
		
		logger.info(reqHTTP.getHeader("X-TOKEN"));
		
		var path = reqHTTP.getServletPath();
		logger.info(path);
		
		if (path.equals("/login")) {
			chain.doFilter(request, response);
			return;
		}
		
		logger.info("Dado que NO va a /login tiene que tener credenciales X-TOKEN valido");
		Utiles.manejarRespuesta(reqHTTP, resHTTP, () -> {
			// voy a asumir que NO tiene credenciales validas
			verificarToken();
			return null;
		});
	}

}
