package org.example.YourSandwich.YourSandwich;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class YourSandwich {
	private ArrayList<Usuarios> usuarios = new ArrayList<Usuarios>();
	public ArrayList<Sandwich> sandwiches = new ArrayList<Sandwich>();
	public ArrayList<Ingredientes> ingredientes = new ArrayList<Ingredientes>();

	public Usuarios buscarUsuario(String rut) {
		for (Usuarios usuario : usuarios) {
			if (usuario.getRut().equals(rut)) {
				return usuario;
			}
		}
		return null;
	}

	public void agregarUsuario(Usuarios usuario) {
		if (buscarUsuario(usuario.getRut()) == null) {
			usuarios.add(usuario);
		} else {
			System.out.println("El usuario ya existe. No se puede agregar.");
		}
	}
	public void crearSandwichPersonalizado() {
	}




	public void crearSandwichAleatorio() {
		if (sandwiches.isEmpty()) {
			System.out.println("No hay sandwiches disponibles.");
			return;
		}

		Random random = new Random();
		int index = random.nextInt(sandwiches.size());
		Sandwich sandwichAleatorio = sandwiches.get(index);

		System.out.println("Tu sandwich aleatorio es: " + sandwichAleatorio.toString());
	}

	public void mostrarSandwich() {
		if (sandwiches.isEmpty()) {
			System.out.println("No hay sandwiches disponibles.");
			return;
		}

		System.out.println("Sandwiches disponibles:");
		for (Sandwich sandwich : sandwiches) {
			System.out.println(sandwich.toString());
		}
	}
}
