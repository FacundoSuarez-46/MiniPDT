package com.proyecto;

import java.util.LinkedList;

public class Rol {
	private String nombre;
	private String descripcion;

	LinkedList<Persona> personas = new LinkedList<Persona>();
	LinkedList<Funcionalidad> funcionalidades = new LinkedList<Funcionalidad>();

	public Rol(String nombre, String descripcion, LinkedList<Persona> personas, LinkedList<Funcionalidad> funcionalidades) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.personas = personas;
		this.funcionalidades = funcionalidades; //Prueba
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

	public LinkedList<Funcionalidad> getFuncionalidades() {
		return funcionalidades;
	}

	public void setFuncionalidades(LinkedList<Funcionalidad> funcionalidades) {
		this.funcionalidades = funcionalidades;
	}
	
	

}
