package org.example.YourSandwich.YourSandwich;

public class Caballo extends Rojas {

	public Caballo(String nombre, String color, String colorRojo, String tipo, double peso) {
		super(nombre, color, colorRojo, tipo, peso);
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}
}