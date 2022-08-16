package com.proyecto;

import java.util.LinkedList;
import java.util.List;

public enum Rol {
	ADMINISTRADOR_DEL_SISTEMA,
	JEFE_DE_SECCION,
	OPERADOR_DE_SECCION("Operador de seccion", " ",);
	
	private String nombre;
	private String descripcion;
	LinkedList<Persona> personasOperador = new LinkedList<Persona>();
	
	
}
