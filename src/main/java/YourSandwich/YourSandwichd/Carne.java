package YourSandwich.YourSandwichd;

public abstract class Carne extends Ingredientes {
	protected String color;

	public Carne(String nombre) {
		super(nombre);
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