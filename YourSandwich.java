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
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese el nombre del sandwich personalizado: ");
		String nombreSandwich = scanner.nextLine();

		Sandwich sandwichPersonalizado = new Sandwich();

		System.out.println("Ingrese los ingredientes deseados para el sandwich (ingrese 'fin' para terminar):");
		String ingrediente;
		do {
			System.out.print("Ingrediente: ");
			ingrediente = scanner.nextLine();
			if (!ingrediente.equalsIgnoreCase("fin")) {
				Ingredientes nuevoIngrediente = crearIngrediente(ingrediente);
				if (nuevoIngrediente != null) {
					sandwichPersonalizado.agregarIngrediente(nuevoIngrediente);
					ingredientes.add(nuevoIngrediente);
				} else {
					System.out.println("Ingrediente desconocido. No se pudo agregar al sandwich.");
				}
			}
		} while (!ingrediente.equalsIgnoreCase("fin"));

		sandwiches.add(sandwichPersonalizado);
		System.out.println("Se ha creado el sandwich personalizado '" + nombreSandwich + "' exitosamente.");
	}

	private Ingredientes crearIngrediente(String nombre) {
		Ingredientes nuevoIngrediente = null;

		if (nombre.equalsIgnoreCase("pepinillo")) {
			nuevoIngrediente = new Pepinillo("Pepinillo", true);
		} else if (nombre.equalsIgnoreCase("pollo")) {
			nuevoIngrediente = new Pollo("Pollo", "Blanco", null, "Pollo", 200);
		} else if (nombre.equalsIgnoreCase("pavo")) {
			nuevoIngrediente = new Pavo("Pavo", "Blanco", null, "Pavo", 100);
		} else if (nombre.equalsIgnoreCase("pescado")) {
			nuevoIngrediente = new Pescado("Pescado", "Blanco", null, "Pescado", 100);
		} else if (nombre.equalsIgnoreCase("vacuno")) {
			nuevoIngrediente = new Vacuno("Vacuno", "Rojo", null, "Vacuno", 200);
		} else if (nombre.equalsIgnoreCase("caballo")) {
			nuevoIngrediente = new Caballo("Caballo", "Rojo", null, "Caballo", 100);
		} else if (nombre.equalsIgnoreCase("cerdo")) {
			nuevoIngrediente = new Cerdo("Pollo", "Blanco", null, "Pollo", 200);
		} else if (nombre.equalsIgnoreCase("lechuga")) {
			nuevoIngrediente = new Lechuga("Lechuga", "Francesa");
		} else if (nombre.equalsIgnoreCase("tomate")) {
			nuevoIngrediente = new Tomate("Tomate", "Peruano");
		} else if (nombre.equalsIgnoreCase("queso")) {
			nuevoIngrediente = new Queso("Queso", "Gauda");
		} else if (nombre.equalsIgnoreCase("palta")) {
			nuevoIngrediente = new Palta("Palta", true);
		} else if (nombre.equalsIgnoreCase("pepino")) {
			nuevoIngrediente = new Pepino("Pepino", null);
		}

		return nuevoIngrediente;
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
