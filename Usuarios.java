package org.example.YourSandwich.YourSandwich;

import java.util.ArrayList;

public class Usuarios {
	private String nombre;
	private String apellido;
	private String rut;
	private int edad;
	private ArrayList<Ingredientes> gustos;
	public Sandwich sandwich;
	public YourSandwich yoursandwich;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public ArrayList<Ingredientes> getGustos() {
		throw new UnsupportedOperationException();
	}

	public void setGustos(ArrayList<Ingredientes> gustos) {
		throw new UnsupportedOperationException();
	}
}