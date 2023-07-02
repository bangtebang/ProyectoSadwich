package YourSandwich.YourSandwichd;
import java.util.ArrayList;
import java.util.List;

public class CombinadorSandwich {
    private List<String> ingredientes;

    public CombinadorSandwich(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void combinarSandwich() {
        List<List<String>> combinaciones = generarCombinaciones(ingredientes);

        for (List<String> combinacion : combinaciones) {
            System.out.println("Combinación: " + combinacion);
        }
    }

    private List<List<String>> generarCombinaciones(List<String> ingredientes) {
        List<List<String>> combinaciones = new ArrayList<>();
        int n = ingredientes.size();

        for (int i = 1; i <= n; i++) {
            generarCombinacionesRecursivas(ingredientes, i, 0, new ArrayList<>(), combinaciones);
        }

        return combinaciones;
    }

    private void generarCombinacionesRecursivas(List<String> ingredientes, int tamañoCombinacion, int inicio, List<String> combinacionActual, List<List<String>> combinaciones) {
        if (tamañoCombinacion == 0) {
            combinaciones.add(new ArrayList<>(combinacionActual));
            return;
        }

        for (int i = inicio; i <= ingredientes.size() - tamañoCombinacion; i++) {
            combinacionActual.add(ingredientes.get(i));
            generarCombinacionesRecursivas(ingredientes, tamañoCombinacion - 1, i + 1, combinacionActual, combinaciones);
            combinacionActual.remove(combinacionActual.size() - 1);
        }
    }
}
