package org.example.YourSandwich.YourSandwich;

import javax.swing.JFrame;
import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        llamarmetodos();
    }

    private static void llamarmetodos() {
        RegistroUsuarioForm registroForm = new RegistroUsuarioForm();
        registroForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registroForm.setSize(900, 200);
        registroForm.setVisible(true);
        registroForm.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                // Se ejecuta cuando se cierra la ventana de registro
                abrirVentanaIngredientes(registroForm.getUsuario());
            }
        });
    }

    private static void abrirVentanaIngredientes(Usuarios usuario) {
        Sandwich sandwich = new Sandwich();
        sandwich.agregarUsuario(usuario);

        IngredientesFrame ingredientesFrame = new IngredientesFrame(sandwich);
        ingredientesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ingredientesFrame.setSize(900, 200);
        ingredientesFrame.setVisible(true);

        ingredientesFrame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                abrirVentanaInformacion(sandwich);
            }
        });
    }

    private static void abrirVentanaInformacion(Sandwich sandwich) {
        InformacionFrame informacionFrame = new InformacionFrame(sandwich);
        informacionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        informacionFrame.setSize(900, 200);
        informacionFrame.setVisible(true);
    }
}
