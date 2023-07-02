import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistroUsuarioForm extends JFrame {
    private JTextField nombreField;
    private JTextField correoField;
    private JTextField edadField;
    private JPasswordField contrasenaField;
    private JButton siguienteButton;

    public RegistroUsuarioForm() {
        JLabel nombreLabel = new JLabel("Nombre:");
        nombreField = new JTextField(20);

        JLabel correoLabel = new JLabel("Correo:");
        correoField = new JTextField(20);

        JLabel edadLabel = new JLabel("Edad:");
        edadField = new JTextField(3);

        JLabel contrasenaLabel = new JLabel("Contraseña:");
        contrasenaField = new JPasswordField(20);

        siguienteButton = new JButton("Siguiente");
        siguienteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener los datos del formulario
                String nombre = nombreField.getText();
                String correo = correoField.getText();
                int edad = Integer.parseInt(edadField.getText());
                String contrasena = new String(contrasenaField.getPassword());

                // Crear una instancia de Usuario
                Usuario usuario = new Usuario(nombre, correo, edad, contrasena);

                // Mostrar la interfaz para seleccionar ingredientes del sándwich
                // Cerrar el formulario de registro de usuario
                dispose();
            }
        });

        // Crear el diseño de la interfaz
        JPanel panel = new JPanel();
        panel.add(nombreLabel);
        panel.add(nombreField);
        panel.add(correoLabel);
        panel.add(correoField);
        panel.add(edadLabel);
        panel.add(edadField);
        panel.add(contrasenaLabel);
        panel.add(contrasenaField);
        panel.add(siguienteButton);

        add(panel);
    }
}