package YourSandwich;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;

public class RegistroUsuarioForm extends JFrame {
    private JTextField nombreField;
    private JTextField apellidoField;
    private JTextField edadField;
    private JPasswordField rutField;
    private JButton siguienteButton;
    private Usuarios usuario; // Variable para almacenar el usuario ingresado

    public RegistroUsuarioForm() {
        JLabel nombreLabel = new JLabel("Nombre:");
        nombreField = new JTextField(20);

        JLabel apellidoLabel = new JLabel("Apellido:");
        apellidoField = new JTextField(20);

        JLabel edadLabel = new JLabel("Edad:");
        edadField = new JTextField(3);

        JLabel rutLabel = new JLabel("Rut:");
        rutField = new JPasswordField(20);

        siguienteButton = new JButton("Siguiente");
        siguienteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreField.getText();
                String apellido = apellidoField.getText();
                String rut = new String(rutField.getPassword());
                int edad;
                try {
                    edad = Integer.parseInt(edadField.getText());
                    if (validarCampos(nombre, apellido, rut, edad)) {
                        usuario = new Usuarios();
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(RegistroUsuarioForm.this, "Por favor, complete todos los campos correctamente.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(RegistroUsuarioForm.this, "La edad debe ser un número entero válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JPanel panel = new JPanel();
        panel.add(nombreLabel);
        panel.add(nombreField);
        panel.add(apellidoLabel);
        panel.add(apellidoField);
        panel.add(edadLabel);
        panel.add(edadField);
        panel.add(rutLabel);
        panel.add(rutField);
        panel.add(siguienteButton);

        add(panel);
    }

    private boolean validarCampos(String nombre, String apellido, String rut, int edad) {
        if (nombre.isEmpty() || apellido.isEmpty() || rut.isEmpty() || edad <= 0) {
            return false;
        }
        return true;
    }

    public Usuarios getUsuario() {
        return usuario;
    }
}
