package org.example.YourSandwich.YourSandwich;

public class Pescado extends Blancas {

	public Pescado(String nombre, String color, String colorBlanco, String tipo, double peso) {
		super(nombre, color, colorBlanco, tipo, peso);
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}
}