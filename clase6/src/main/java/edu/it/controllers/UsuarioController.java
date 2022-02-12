package edu.it.controllers;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.it.components.Utiles;
import edu.it.dtos.UsuPass;
import edu.it.model.Usuario;

public class UsuarioController extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws IOException, ServletException {   
		
		Utiles.manejarRespuesta(request, response, () -> {
        	return "hola";
        });
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
		
		Utiles.manejarRespuesta(request, response, () -> {
			UsuPass usuPass = Utiles.deserializarInputStream(request, UsuPass.class);
			Usuario usuario = new Usuario();
			usuario.id = UUID.randomUUID().toString();
			usuario.nombre = usuPass.usuario;
			usuario.salt = "TENEMOS QUE VER LA TEORIA";
			usuario.passwordEnciptada = "ACA NO SE VA A PODER VER LA PASS";
			Utiles.persistirObjeto(usuario);
			return usuario.id;
		}, 201);	
	}
	public void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
		
	}
}
