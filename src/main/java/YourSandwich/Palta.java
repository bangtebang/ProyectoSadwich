package YourSandwich;

public class Palta extends Ingredientes {
	private boolean deseaPalta;

	public Palta(String nombre, boolean deseaPalta) {
		super(nombre);
		this.deseaPalta = deseaPalta;
	}

	public boolean getDeseaPalta() {
		return this.deseaPalta;
	}

	public void setDeseaPalta(boolean deseaPalta) {
		this.deseaPalta = deseaPalta;
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}
}