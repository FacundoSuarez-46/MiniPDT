package com.proyecto;

import java.util.LinkedList;
import java.util.List;

public class Rol {
	private String nombre;
	private String descripcion;

	LinkedList<Persona> personas = new LinkedList<Persona>();

	public Rol(String nombre, String descripcion, LinkedList<Persona> personas) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.personas = personas;
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

	public LinkedList<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(LinkedList<Persona> personas) {
		this.personas = personas;
	}

}
