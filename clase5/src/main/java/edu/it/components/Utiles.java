package edu.it.components;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.github.javafaker.Faker;
import com.google.gson.Gson;

import edu.it.dtos.ResultadoError;
import edu.it.dtos.ResultadoOK;
import edu.it.errores.BadRequestException;
import edu.it.errores.HttpException;
import edu.it.errores.NotFoundException;
import edu.it.interfaces.InversionDeControl;
import edu.it.model.Alumno;

public class Utiles {
	public static Alumno generarAlumnoRandom() {
		Faker fkr = new Faker();
		
		return new Alumno(
				UUID.randomUUID().toString(),
	            fkr.address().firstName(),
	            fkr.address().lastName(),
	            fkr.address().streetName(),
	            fkr.address().streetAddressNumber(),
	            fkr.address().state(),
	            fkr.address().country()
	        );
	}
	private static String leerInputStreamReaderManejado(InputStream inputStream) throws Exception {
		InputStreamReader isr = new InputStreamReader(inputStream);
		BufferedReader br = new BufferedReader(isr);
		StringBuilder sb = new StringBuilder();
		for (String s = br.readLine(); s != null; s = br.readLine()) {
			sb.append(s);
		}
		return sb.toString();
	}
	public static String leerInputStreamReader(InputStream inputStream) {
		try {
			return leerInputStreamReaderManejado(inputStream);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex.getMessage());
		}
	}
	public static <T> T deserializarInputStream(HttpServletRequest req, Class<T> clazz) {
		String serializado = "";
		
		try {
			serializado = leerInputStreamReader(req.getInputStream());
			return new Gson().fromJson(serializado, clazz);
		}
		catch (Exception ex) {
			throw new BadRequestException("No se pudo interpretar json");
		}
	}
	public static void persistirObjeto(Object obj) {
		var conn = new ConectorJPA();
	    var entityManager =	conn.getEntityManager();
	    var tx = entityManager.getTransaction();
	    tx.begin();
	    entityManager.merge(obj);
	    tx.commit();
	}
	public static void borrarObjeto(String id) {
		var conn = new ConectorJPA();
	    var entityManager =	conn.getEntityManager();
	    var tx = entityManager.getTransaction();
	    tx.begin();
	    var alumno = entityManager.find(Alumno.class, id);
	    if (alumno == null) {
	    	throw new NotFoundException("Alumno NO encontrado");
	    }
	    entityManager.remove(alumno);
	    tx.commit();
	}
	public static void manejarRespuesta(
			HttpServletRequest req,
			HttpServletResponse res,
			InversionDeControl ioc) {
		
		manejarRespuesta(req, res, ioc, 200);
	}
	
	public static void manejarRespuesta(
			HttpServletRequest req,
			HttpServletResponse res,
			InversionDeControl ioc,
			Integer httpStatus) {
		
		res.setContentType("application/json");
		PrintWriter out = null;
		
		try {
			out = res.getWriter();
			var z = ioc.controlar();
			out.println(new Gson().toJson(new ResultadoOK(z)));   
            res.setStatus(httpStatus);
		}
		catch (HttpException ex) {
			res.setStatus(ex.status);
			out.println(new Gson().toJson(new ResultadoError(ex.mensaje)));
		}
		catch (Exception ex) {
			res.setStatus(500);
			out.println(new Gson().toJson(new ResultadoError("Error en el servidor")));
		}
	}
	public static Map<String, String> obtenerMapa(String key, String value) {
		var map = new HashMap<String, String>();
		map.put(key, value);
		return map;
	}
	
}
