package YourSandwich;

public class Lechuga extends Ingredientes {
	private String tipo;

	public Lechuga(String nombre, String tipo) {
		super(nombre);
		this.tipo = tipo;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}