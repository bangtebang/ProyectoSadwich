package org.example.YourSandwich.YourSandwich;

public abstract class Rojas extends Carne {
	protected String colorRojo;
	protected String tipo;
	protected double peso;

	public Rojas(String nombre, String color, String colorRojo, String tipo, double peso) {
		super(nombre, color);
		this.colorRojo =colorRojo;
		this.tipo =tipo;
		this.peso = peso;
	}

	public String getColorRojo() {
		return this.colorRojo;
	}

	public void setColorRojo(String colorRojo) {
		this.colorRojo = colorRojo;
	}

	public void getAttribute() {
		throw new UnsupportedOperationException();
	}

	public void setAttribute(Object attribute) {
		throw new UnsupportedOperationException();
	}

	public abstract String getTipo();
}