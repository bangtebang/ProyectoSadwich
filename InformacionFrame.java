package org.example.YourSandwich.YourSandwich;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class InformacionFrame extends JFrame {
    private Sandwich sandwich;

    public InformacionFrame(Sandwich sandwich) {
        super("Información del Sandwich");
        this.sandwich = sandwich;

        initComponents();
    }

    private void initComponents() {
        setLayout(new FlowLayout());

        JLabel label = new JLabel("Su sandwich contiene los siguientes ingredientes:");
        add(label);

        List<Ingredientes> ingredientes = sandwich.getIngredientes();
        for (Ingredientes ingrediente : ingredientes) {
            JLabel ingredienteLabel = new JLabel(ingrediente.getNombre());
            add(ingredienteLabel);
        }

        JButton crearSandwichButton = new JButton("Crear Sandwich");
        crearSandwichButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarMensajeIngredientes();
            }
        });
        add(crearSandwichButton);
    }

    private void mostrarMensajeIngredientes() {
        StringBuilder ingredientesTexto = new StringBuilder();
        List<Ingredientes> ingredientes = sandwich.getIngredientes();

        for (Ingredientes ingrediente : ingredientes) {
            ingredientesTexto.append(ingrediente.getNombre()).append(", ");
        }

        // Eliminar la última coma y espacio
        if (ingredientesTexto.length() > 0) {
            ingredientesTexto.delete(ingredientesTexto.length() - 2, ingredientesTexto.length());
        }

        String mensaje;
        if (ingredientesTexto.length() > 0) {
            mensaje = "Su sandwich contiene: " + ingredientesTexto.toString();
        } else {
            mensaje = "Su sandwich no contiene ingredientes";
        }

        JOptionPane.showMessageDialog(this, mensaje);
    }
}
