package YourSandwich;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class IngredientesFrame extends JFrame {
    private Sandwich sandwich;
    private List<JCheckBox> ingredientesCheckBoxes;
    private JRadioButton[] carneRojaRadioButtons;
    private JRadioButton[] carneBlancaRadioButtons;

    public IngredientesFrame(Sandwich sandwich) {
        super("Selección de Ingredientes");
        this.sandwich = sandwich;
        ingredientesCheckBoxes = new ArrayList<>();
        carneRojaRadioButtons = new JRadioButton[3];
        carneBlancaRadioButtons = new JRadioButton[3];

        initComponents();
    }

    private void initComponents() {
        setLayout(new FlowLayout());

        JLabel label = new JLabel("Seleccione los ingredientes:");
        add(label);

        JCheckBox paltaCheckBox = new JCheckBox("Palta");
        ingredientesCheckBoxes.add(paltaCheckBox);
        add(paltaCheckBox);

        JCheckBox pepinoCheckBox = new JCheckBox("Pepino");
        ingredientesCheckBoxes.add(pepinoCheckBox);
        add(pepinoCheckBox);

        JCheckBox pepinilloCheckBox = new JCheckBox("Pepinillo");
        ingredientesCheckBoxes.add(pepinilloCheckBox);
        add(pepinilloCheckBox);

        JCheckBox quesoCheckBox = new JCheckBox("Queso");
        ingredientesCheckBoxes.add(quesoCheckBox);
        add(quesoCheckBox);

        JCheckBox tomateCheckBox = new JCheckBox("Tomate");
        ingredientesCheckBoxes.add(tomateCheckBox);
        add(tomateCheckBox);

        JCheckBox lechugaCheckBox = new JCheckBox("Lechuga");
        ingredientesCheckBoxes.add(lechugaCheckBox);
        add(lechugaCheckBox);

        add(Box.createRigidArea(new Dimension(300, 10))); // Espacio entre los ingredientes y las carnes

        JPanel carnePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        carnePanel.setBorder(BorderFactory.createTitledBorder("Selección de Carnes"));

        JPanel carneBlancaPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel carneBlancaLabel = new JLabel("Carne Blanca:");
        carneBlancaPanel.add(carneBlancaLabel);

        String[] opcionesCarneBlanca = {"Pollo", "Pavo", "Pescado"};
        ButtonGroup carneBlancaButtonGroup = new ButtonGroup();

        for (int i = 0; i < opcionesCarneBlanca.length; i++) {
            String opcion = opcionesCarneBlanca[i];
            JRadioButton radioButton = new JRadioButton(opcion);
            carneBlancaRadioButtons[i] = radioButton;
            carneBlancaButtonGroup.add(radioButton);
            carneBlancaPanel.add(radioButton);
        }

        carnePanel.add(carneBlancaPanel);

        JPanel carneRojaPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel carneRojaLabel = new JLabel("Carne Roja:");
        carneRojaPanel.add(carneRojaLabel);

        String[] opcionesCarneRoja = {"Caballo", "Vacuno", "Cerdo"};
        ButtonGroup carneRojaButtonGroup = new ButtonGroup();

        for (int i = 0; i < opcionesCarneRoja.length; i++) {
            String opcion = opcionesCarneRoja[i];
            JRadioButton radioButton = new JRadioButton(opcion);
            carneRojaRadioButtons[i] = radioButton;
            carneRojaButtonGroup.add(radioButton);
            carneRojaPanel.add(radioButton);
        }

        carnePanel.add(carneRojaPanel);

        add(carnePanel);

        JButton sandwichAleatorioButton = new JButton("Sandwich Aleatorio");
        sandwichAleatorioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crearSandwichAleatorio();
            }
        });
        add(sandwichAleatorioButton);

        JButton crearSandwichButton = new JButton("Crear Sandwich");
        crearSandwichButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarIngredientesSeleccionados();
                InformacionFrame informacionFrame = new InformacionFrame(sandwich);
                informacionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                informacionFrame.setSize(400, 300);
                informacionFrame.setVisible(true);
                setVisible(false);
            }
        });
        add(crearSandwichButton);

        pack();
    }

    private void guardarIngredientesSeleccionados() {
        sandwich.getIngredientes().clear();

        for (JCheckBox checkBox : ingredientesCheckBoxes) {
            if (checkBox.isSelected()) {
                String nombreIngrediente = checkBox.getText();
                Ingredientes ingrediente = null;

                if (nombreIngrediente.equals("Palta")) {
                    ingrediente = new Palta("Palta", true);
                } else if (nombreIngrediente.equals("Pepino")) {
                    ingrediente = new Pepino("Pepino", null);
                } else if (nombreIngrediente.equals("Pepinillo")) {
                    ingrediente = new Pepinillo("Pepinillo", true);
                } else if (nombreIngrediente.equals("Lechuga")) {
                    ingrediente = new Lechuga("Lechuga", null);
                } else if (nombreIngrediente.equals("Queso")) {
                    ingrediente = new Queso("Queso", null);
                } else if(nombreIngrediente.equals("Tomate")) {
                    ingrediente = new Tomate("Tomate", null);
                }

                if (ingrediente != null) {
                    sandwich.agregarIngrediente(ingrediente);
                }
            }
        }

        for (JRadioButton radioButton : carneBlancaRadioButtons) {
            if (radioButton.isSelected()) {
                String tipoCarne = radioButton.getText();
                Blancas carneBlanca = null;

                if (tipoCarne.equals("Pollo")) {
                    carneBlanca = new Pollo("Pollo", null, null, null, 10);
                } else if (tipoCarne.equals("Pavo")) {
                    carneBlanca = new Pavo("Pavo", null, null, null, 20);
                } else if (tipoCarne.equals("Pescado")) {
                    carneBlanca = new Pescado("Pescado", null, null, null, 10);
                }

                if (carneBlanca != null) {
                    sandwich.agregarIngrediente(carneBlanca);
                }
            }
        }

        for (JRadioButton radioButton : carneRojaRadioButtons) {
            if (radioButton.isSelected()) {
                String tipoCarne = radioButton.getText();
                Rojas carneRoja = null;

                if (tipoCarne.equals("Caballo")) {
                    carneRoja = new Caballo("Caballo", null, null, null, 10);
                } else if (tipoCarne.equals("Vacuno")) {
                    carneRoja = new Vacuno("Vacuno", null, null, null, 10);
                } else if (tipoCarne.equals("Cerdo")) {
                    carneRoja = new Cerdo("Cerdo", null, null, null, 10);
                }

                if (carneRoja != null) {
                    sandwich.agregarIngrediente(carneRoja);
                }
            }
        }
    }

    private void crearSandwichAleatorio() {
        sandwich.getIngredientes().clear();

        Ingredientes[] ingredientesAleatorios = obtenerIngredientesAleatorios();
        for (Ingredientes ingrediente : ingredientesAleatorios) {
            sandwich.agregarIngrediente(ingrediente);
        }

        InformacionFrame informacionFrame = new InformacionFrame(sandwich);
        informacionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        informacionFrame.setSize(400, 300);
        informacionFrame.setVisible(true);
        setVisible(false);
    }

    private Ingredientes[] obtenerIngredientesAleatorios() {
        Ingredientes[] ingredientesDisponibles = {
                new Palta("Palta", true),
                new Pepino("Pepino", null),
                new Pepinillo("Pepinillo", true),
                new Lechuga("Lechuga", null),
                new Queso("Queso", null),
                new Tomate("Tomate", null)
        };

        int cantidadIngredientes = (int) (Math.random() * 4) + 1;

        List<Ingredientes> ingredientesAleatorios = new ArrayList<>();
        while (ingredientesAleatorios.size() < cantidadIngredientes) {
            Ingredientes ingrediente = ingredientesDisponibles[(int) (Math.random() * ingredientesDisponibles.length)];
            if (!ingredientesAleatorios.contains(ingrediente)) {
                ingredientesAleatorios.add(ingrediente);
            }
        }

        return ingredientesAleatorios.toArray(new Ingredientes[0]);
    }
}
