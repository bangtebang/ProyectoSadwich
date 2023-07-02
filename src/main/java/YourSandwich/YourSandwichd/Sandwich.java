package YourSandwich.YourSandwichd;

import java.util.ArrayList;
import YourSandwich.YourSandwichd.Ingredientes;

public class Sandwich {
	private String nombre;
	private int cantidadIngredientes;
	private YourSandwich yourSandwich;
	private ArrayList<Ingredientes> ingredienteses = new ArrayList<Ingredientes>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadIngredientes() {
		return this.cantidadIngredientes;
	}

	public void setCantidadIngredientes(int cantidadIngredientes) {
		this.cantidadIngredientes = cantidadIngredientes;
	}

	public Sandwich(String nombre, int cantidadIngredientes) {
		throw new UnsupportedOperationException();
	}
}