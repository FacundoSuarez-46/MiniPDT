package com.proyecto;

import java.util.LinkedList;

public enum Funcionalidad {
	CONTROL_DE_INVENTARIO,
	VENTAS,
	COMPRAS,
	CUENTAS_CORRIENTES,
	SUELDOS;
	
	private String nombre;
	private String descripcion;
	LinkedList<Rol> roles = new LinkedList<>();
	
}
