package com.principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import com.proyecto.Persona;

public class Main {

	public static void main(String[] args) throws ParseException {
		String sDate1="31/12/1998";
		Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);

		Persona p1 = new Persona("5000111-2", "Perez", "Silva", "Juan", "Pedro", date1,"111222hola", "prueba1@utec.com", null);
		
	
	}

}
