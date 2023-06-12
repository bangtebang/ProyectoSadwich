public class Cliente extends Persona {
	private String direccion;
	public Venta venta;

	public Cliente(String nombre, String rut) {
		super(nombre, rut);
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}