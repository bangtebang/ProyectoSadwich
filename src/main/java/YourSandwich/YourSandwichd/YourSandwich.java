package YourSandwich.YourSandwichd;

import java.util.ArrayList;
import YourSandwich.YourSandwichd.Sandwich;

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
		throw new UnsupportedOperationException();
	}

	public Usuario agregarUsuario(Usuario usuario) {
		throw new UnsupportedOperationException();
	}

	public void mostrarIngredientes() {
		throw new UnsupportedOperationException();
	}

	public YourSandwich(String usuarios, String ingredientes, String sandwich) {
		throw new UnsupportedOperationException();
	}
}