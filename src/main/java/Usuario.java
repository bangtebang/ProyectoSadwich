public class Usuario {
    private String nombre;
    private String correo;
    private int edad;
    private String contrasena;

    public Usuario(String nombre, String correo, int edad, String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
        this.contrasena = contrasena;
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}