package YourSandwich;

public abstract class Ingredientes {
	protected String nombre;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract String getTipo();

	public Ingredientes(String nombre) {
		this.nombre = nombre;
	}
}