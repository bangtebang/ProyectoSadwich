package org.example.YourSandwich.YourSandwich;

import javax.swing.*;
import java.awt.*;

public class SandwichFrame extends JFrame {
    private JTextArea txtResultado;

    public SandwichFrame(Sandwich sandwich) {
        setTitle("Resultado");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLayout(new BorderLayout());

        txtResultado = new JTextArea();
        txtResultado.setEditable(false);
        txtResultado.setFont(new Font("Monospaced", Font.PLAIN, 12));
        txtResultado.setText(generarTextoSandwich(sandwich));
        add(new JScrollPane(txtResultado), BorderLayout.CENTER);

        setVisible(true);
    }

    private String generarTextoSandwich(Sandwich sandwich) {
        StringBuilder sb = new StringBuilder();
        sb.append("Pan - ");
        for (Ingredientes ingrediente : sandwich.getIngredientes()) {
            sb.append(ingrediente).append(" - ");
        }
        sb.append("Pan");

        return sb.toString();
    }
}