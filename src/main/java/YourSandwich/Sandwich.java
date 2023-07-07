package YourSandwich;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
	private List<Usuarios> usuarios;
	private List<Ingredientes> ingredientes;

	public Sandwich() {
		usuarios = new ArrayList<>();
		ingredientes = new ArrayList<>();
	}

	public List<Usuarios> getUsuarios() {
		return usuarios;
	}

	public void agregarUsuario(Usuarios usuario) {
		usuarios.add(usuario);
	}

	public List<Ingredientes> getIngredientes() {
		return ingredientes;
	}

	public void agregarIngrediente(Ingredientes ingrediente) {
		ingredientes.add(ingrediente);
	}
}
