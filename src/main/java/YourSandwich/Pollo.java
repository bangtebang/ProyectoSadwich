package YourSandwich;

public class Pollo extends Blancas {

	public Pollo(String nombre, String color, String colorBlanco, String tipo, double peso) {
		super(nombre, color, colorBlanco, tipo, peso);
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}
}