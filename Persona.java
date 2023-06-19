import java.util.ArrayList;

public class Persona {
	protected String nombre;
	protected String rut;
	public ArrayList<Gusto> gustos = new ArrayList<Gusto>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}
}