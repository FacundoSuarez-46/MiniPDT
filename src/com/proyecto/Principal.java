package com.proyecto;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import ui.Login;

public class Principal {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        
        Login login = new Login();
    }

}
