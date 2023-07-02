package YourSandwich.YourSandwichd;
import java.util.ArrayList;
import java.util.List;

public class YourSandwich {
	private String usuarios;
	private String ingredientes;
	private String sandwich;
	private ArrayList<Sandwich> sandwichss = new ArrayList<Sandwich>();

	public String getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(String usuarios) {
		this.usuarios = usuarios;
	}

	public String getIngredientes() {
		return this.ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getSandwich() {
		return this.sandwich;
	}

	public void setSandwich(String sandwich) {
		this.sandwich = sandwich;
	}

	public void combinarSandwich() {
		// Implementación básica para combinar el sandwich
		System.out.println("Combinando el sandwich: " + sandwich);

		// Llamar al método combinarSandwich de la clase CombinadorSandwich
		CombinadorSandwich combinador = new CombinadorSandwich(parseIngredientes());
		combinador.combinarSandwich();
	}

	private List<String> parseIngredientes() {
		// Aquí puedes implementar la lógica para convertir la cadena de ingredientes en una lista de ingredientes separados
		// Por simplicidad, asumamos que los ingredientes están separados por comas
		String[] ingredientesArray = ingredientes.split(",");
		List<String> ingredientesList = new ArrayList<>();

		for (String ingrediente : ingredientesArray) {
			ingredientesList.add(ingrediente.trim());
		}

		return ingredientesList;
	}

	public void agregarUsuario(Usuario usuario) {
		// Implementación básica para agregar un usuario a la lista de usuarios
		System.out.println("Agregando usuario: " + usuario.getNombre());
		// Aquí podrías añadir la lógica necesaria para almacenar el usuario en una lista, base de datos, etc.
	}

	public void mostrarIngredientes() {
		// Implementación básica para mostrar los ingredientes del sandwich
		System.out.println("Ingredientes del sandwich: " + ingredientes);
	}

	public YourSandwich(String usuarios, String ingredientes, String sandwich) {
		this.usuarios = usuarios;
		this.ingredientes = ingredientes;
		this.sandwich = sandwich;
	}
}
