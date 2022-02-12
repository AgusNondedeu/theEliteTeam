package edu.it.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.it.components.Utiles;

public class UsuarioController extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws IOException, ServletException {   
		
		Utiles.manejarRespuesta(request, response, () -> {
        	return "hola";
        });
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
	}
	public void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
		
	}
}
