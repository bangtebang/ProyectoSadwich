import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        RegistroUsuarioForm registroForm = new RegistroUsuarioForm();
        registroForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registroForm.setSize(400, 300);
        registroForm.setVisible(true);
        // Crear un objeto Sandwich
        Sandwich sandwich = new Sandwich();
        // Mostrar la interfaz para seleccionar ingredientes
        IngredientesFrame ingredientesFrame = new IngredientesFrame(sandwich);
    }
}