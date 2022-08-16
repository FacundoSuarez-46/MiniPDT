package com.proyecto;

import java.util.LinkedList;
import java.util.List;

public class Rol { 
	private String nombre;
	private String descripcion;
	
	LinkedList<Persona> personasAdministrador = new LinkedList<Persona>();
	LinkedList<Persona> personasJefe = new LinkedList<Persona>();
	LinkedList<Persona> personasOperador = new LinkedList<Persona>();
	
	public Rol(String nombre, String descripcion, LinkedList<Persona> personasAdministrador,
			LinkedList<Persona> personasJefe, LinkedList<Persona> personasOperador) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.personasAdministrador = personasAdministrador;
		this.personasJefe = personasJefe;
		this.personasOperador = personasOperador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public LinkedList<Persona> getPersonasAdministrador() {
		return personasAdministrador;
	}
	public void setPersonasAdministrador(LinkedList<Persona> personasAdministrador) {
		this.personasAdministrador = personasAdministrador;
	}
	public LinkedList<Persona> getPersonasJefe() {
		return personasJefe;
	}
	public void setPersonasJefe(LinkedList<Persona> personasJefe) {
		this.personasJefe = personasJefe;
	}
	public LinkedList<Persona> getPersonasOperador() {
		return personasOperador;
	}
	public void setPersonasOperador(LinkedList<Persona> personasOperador) {
		this.personasOperador = personasOperador;
	}
	
	
}
