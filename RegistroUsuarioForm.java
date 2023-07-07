package org.example.YourSandwich.YourSandwich;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

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

    private void guardarDatosEnExcel(String nombre, String apellido, int edad, String rut) {
        try {
            // Crear un libro de Excel
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Usuarios");

            // Crear la fila de encabezados
            Row headerRow = sheet.createRow(0);
            Cell nombreHeader = headerRow.createCell(0);
            nombreHeader.setCellValue("Nombre");
            Cell apellidoHeader = headerRow.createCell(1);
            apellidoHeader.setCellValue("Apellido");
            Cell edadHeader = headerRow.createCell(2);
            edadHeader.setCellValue("Edad");
            Cell rutHeader = headerRow.createCell(3);
            rutHeader.setCellValue("RUT");

            // Crear la fila de datos
            Row dataRow = sheet.createRow(1);
            Cell nombreCell = dataRow.createCell(0);
            nombreCell.setCellValue(nombre);
            Cell apellidoCell = dataRow.createCell(1);
            apellidoCell.setCellValue(apellido);
            Cell edadCell = dataRow.createCell(2);
            edadCell.setCellValue(edad);
            Cell rutCell = dataRow.createCell(3);
            rutCell.setCellValue(rut);

            // Guardar el libro de Excel en un archivo
            try (FileOutputStream fileOut = new FileOutputStream("datos_usuarios.xlsx")) {
                workbook.write(fileOut);
            }

            JOptionPane.showMessageDialog(RegistroUsuarioForm.this, "Datos guardados exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(RegistroUsuarioForm.this, "Error al guardar los datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

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
                        usuario = new Usuarios(); // Crear el objeto de usuario
                        guardarDatosEnExcel(nombre, apellido, edad, rut); // Guardar los datos en Excel
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
