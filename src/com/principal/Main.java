package com.principal;

import com.formdev.flatlaf.FlatLightLaf;
import com.proyecto.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.UIManager;
import ui.Login;

public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        Login login = new Login();

        /* String sDate1 = "10/02/1999";
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);

        Persona p1 = new Persona("5000111-2", "Perez", "Silva", "Juan", "Pedro", date1, "111222hola", "prueba1@utec.com", null);

        Rol rAdmin = new Rol("Administrador de Sistemas", "Encargado de administrar el sistema", null, null);
        Rol rJefe = new Rol("Jefe de Sección", "Encargado de gestionar las secciones", null, null);
        Rol rOperador = new Rol("Operador de Sección", "Se encarga de operar en las secciones", null, null);

        Funcionalidad fControl = new Funcionalidad("Control de inventario", "Se analiza y controla el stock de inventario", null);
        Funcionalidad fVentas = new Funcionalidad("Ventas", "Registro de ventas", null);
        Funcionalidad fCompras = new Funcionalidad("Compras", "Registro de compras", null);
        Funcionalidad fCuenta = new Funcionalidad("Cuenta corrientes", "Registro de las cuentas corrientes", null);
        Funcionalidad fSueldos = new Funcionalidad("Sueldos", "Registro de sueldos", null); */
    }

}
