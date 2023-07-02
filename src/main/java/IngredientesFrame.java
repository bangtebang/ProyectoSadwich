import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

public class IngredientesFrame extends JFrame implements ActionListener {
    private JCheckBox[] ingredientesCheckBoxes;
    private JButton btnCrearSandwich;
    private Sandwich sandwich;

    public IngredientesFrame(Sandwich sandwich) {
        this.sandwich = sandwich;
        setTitle("Seleccionar Ingredientes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLayout(new FlowLayout());

        List<String> ingredientes = Arrays.asList("Salmon", "Lechuga", "Tomate", "Queso", "Jamón", "Mayonesa", "Mostaza",
                "Cebolla", "Pepinillos", "Pimiento");

        ingredientesCheckBoxes = new JCheckBox[ingredientes.size()];

        for (int i = 0; i < ingredientes.size(); i++) {
            ingredientesCheckBoxes[i] = new JCheckBox(ingredientes.get(i));
            add(ingredientesCheckBoxes[i]);
        }

        btnCrearSandwich = new JButton("Crear Sandwich");
        btnCrearSandwich.addActionListener(this);
        add(btnCrearSandwich);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (JCheckBox checkBox : ingredientesCheckBoxes) {
            if (checkBox.isSelected()) {
                sandwich.agregarIngrediente(checkBox.getText());
            }
        }

        SandwichFrame sandwichFrame = new SandwichFrame(sandwich);
        setVisible(false);
    }
}