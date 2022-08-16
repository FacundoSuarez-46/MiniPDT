package com.proyecto;

import java.util.LinkedList;

public class Funcionalidad {
	
	private String nombre;
	private String descripcion;
	LinkedList<Rol> rol = new LinkedList<Rol>();
	
	public Funcionalidad(String nombre, String descripcion, LinkedList<Rol> rolAdimnistrador, LinkedList<Rol> rolJefe,
			LinkedList<Rol> rolOperador) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.rol = rol;
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
	
	
	
	
 	
}
