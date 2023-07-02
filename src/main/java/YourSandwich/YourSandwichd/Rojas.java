package YourSandwich.YourSandwichd;

public abstract class Rojas extends Carne {
	protected String colorRojo;

	public Rojas(String nombre) {
		super(nombre);
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
}