package edu.it.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import edu.it.components.ConectorJPA;
import edu.it.components.Utiles;
import edu.it.dtos.ResultadoError;
import edu.it.dtos.ResultadoOK;
import edu.it.model.Alumno;

public class AlumnosController extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException {
    		response.setContentType("application/json");
            PrintWriter out = response.getWriter();
            out.println("<h1>Hora Actual: ");
            out.println(System.currentTimeMillis());
            out.println("</h1>");
            response.setStatus(200);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
    	
			Utiles.manejarRespuesta(request, response, () -> {
				Alumno a = Utiles.deserializarInputStream(request, Alumno.class);
				Utiles.persistirObjeto(a);
				return a;
			});
    }
    public void doPut(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
    	
    	response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hora Actual: ");
        out.println(System.currentTimeMillis());
        out.println("</h1>");
        response.setStatus(200);
    }
    public void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
    	
    	response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hora Actual: ");
        out.println(System.currentTimeMillis());
        out.println("</h1>");
        response.setStatus(200);
    }   
}
