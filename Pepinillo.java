package org.example.YourSandwich.YourSandwich;

public class Pepinillo extends Ingredientes {
	private boolean deseaPepinillo;

	public Pepinillo(String nombre, boolean deseaPepinillo) {
		super(nombre);
		this.deseaPepinillo = deseaPepinillo;
	}

	public boolean getDeseaPepinillo() {
		return this.deseaPepinillo;
	}

	public void setDeseaPepinillo(boolean deseaPepinillo) {
		this.deseaPepinillo = deseaPepinillo;
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}
}