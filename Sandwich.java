package org.example.YourSandwich.YourSandwich;

import java.util.ArrayList;

public class Sandwich {
	public ArrayList<Ingredientes> ingredientes = new ArrayList<Ingredientes>();
	public Sandwich() {
		this.ingredientes = new ArrayList<>();
	}
	public ArrayList<Ingredientes> getIngredientes(){
		return this.ingredientes;
	}

	public void setIngredientes(ArrayList<Ingredientes> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public void crearSandwichPersonalizado() {
		throw new UnsupportedOperationException();
	}

	public void crearSandwichAleatorio() {
		throw new UnsupportedOperationException();
	}
}