package YourSandwich;

public class Cerdo extends Rojas {

	public Cerdo(String nombre, String color, String colorRojo, String tipo, double peso) {
		super(nombre, color, colorRojo, tipo, peso);
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}
}