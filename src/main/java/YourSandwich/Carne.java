package YourSandwich;

public abstract class Carne extends Ingredientes {
	protected String color;

	public Carne(String nombre, String color) {
		super(nombre);
		this.color = color;
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}