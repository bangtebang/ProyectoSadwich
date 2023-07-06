package org.example.YourSandwich.YourSandwich;

public class Pavo extends Blancas {

	public Pavo(String nombre, String color, String colorBlanco, String tipo, double peso) {
		super(nombre, color, colorBlanco, tipo, peso);
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}
}