package swich;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // Creamos el scanner
		char opcion; // Creamos la variable para la opción

		System.out.println("Introduce tu letra de carnet: "); // Pide el tipo de carnet
		opcion = scanner.nextLine().charAt(0); // Lee el teclado

		switch (opcion) { // Evalua las posibilidades del caracter introducido
		case 'E' -> { 
			System.out.println("Remolques");
			break;
		}
		case 'D' -> {
			System.out.println("Autobuses");
			break;
		}
		case 'C' -> { 
			System.out.println("Camiones");
			break;
		}
		case 'B' -> { 
			System.out.println("Automoviles");
			break;
		}
		case 'A' -> { 
			System.out.println("Motocicletas");
			break;
		}
		default -> { 
			System.out.println("Categoria no contemplada");
			break;
		}
		}

		scanner.close(); // Cerramos el scanner

	}

}
