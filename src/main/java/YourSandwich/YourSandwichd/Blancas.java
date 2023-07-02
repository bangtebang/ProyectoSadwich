package YourSandwich.YourSandwichd;

public abstract class Blancas extends Carne {
	protected String colorBlanco;

	public Blancas(String nombre) {
		super(nombre);
	}

	public String getColorBlanco() {
		return this.colorBlanco;
	}

	public void setColorBlanco(String colorBlanco) {
		this.colorBlanco = colorBlanco;
	}
}