package YourSandwich.YourSandwichd;

public abstract class Ingredientes {
	protected String nombre;
	private Sandwich sandwich;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract String getTipo();

	public Ingredientes(String nombre) {
		throw new UnsupportedOperationException();
	}
}