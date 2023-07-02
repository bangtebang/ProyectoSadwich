import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private List<String> ingredientes;

    public Sandwich() {
        this.ingredientes = new ArrayList<>();
    }

    public void agregarIngrediente(String ingrediente) {
        if (ingredientes.size() < 5) {
            ingredientes.add(ingrediente);
        }
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }
}