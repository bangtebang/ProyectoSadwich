public class Empleado extends Persona {
	private String cargo;
    public Empleado(String nombre, String rut, String cargo){
		super(nombre, rut);
	}
	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}