package org.example.YourSandwich.YourSandwich;

public abstract class Blancas extends Carne {
	protected String colorBlanco;
	protected String tipo;
	protected double peso;

	public Blancas(String nombre, String color, String colorBlanco, String tipo, double peso) {
		super(nombre, color);
		this.colorBlanco = colorBlanco;
		this.tipo = tipo;
		this.peso = peso;
	}

	public String getColorBlanco() {
		return this.colorBlanco;
	}

	public void setColorBlanco(String colorBlanco) {
		this.colorBlanco = colorBlanco;
	}

	public abstract String getTipo();

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}