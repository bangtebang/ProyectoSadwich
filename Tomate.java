package org.example.YourSandwich.YourSandwich;

public class Tomate extends Ingredientes {
	private String tipo;

	public Tomate(String nombre, String tipo) {
		super(nombre);
		this.tipo = tipo;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}