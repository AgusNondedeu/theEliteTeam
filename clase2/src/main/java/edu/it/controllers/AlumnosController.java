package edu.it.controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
    			response.setContentType("application/json");
                
    			// Lectura del contenido entrante
    			InputStreamReader isr = new InputStreamReader(request.getInputStream());
    			BufferedReader br = new BufferedReader(isr);
    			StringBuilder sb = new StringBuilder();
    			for (String s = br.readLine(); s != null; s = br.readLine()) {
    				sb.append(s);
    			}
    			// Fin lectura contenido entrante
    			
    			System.out.println(sb.toString());
    			
    			PrintWriter out = response.getWriter();
                out.println("Alumno agregado de forma exitosa... ");
                
                response.setStatus(201);
        }
}
