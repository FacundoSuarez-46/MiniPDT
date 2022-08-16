package com.proyecto;

import java.util.LinkedList;
import java.util.List;

public class Rol { 
	private String nombre;
	private String descripcion;
	
	LinkedList<Persona> personasAdministrador = new LinkedList<Persona>();
	LinkedList<Persona> personasJefe = new LinkedList<Persona>();
	LinkedList<Persona> personasOperador = new LinkedList<Persona>();
	
	
}
