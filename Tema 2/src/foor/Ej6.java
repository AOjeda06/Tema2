package foor;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Creamos el scanner

		// Variables
		int num, contador = 0;

		// Bucle
		for (int i = 0; i < 5; i++) {

			// Muestra texto por pantalla y guarda la respuesta
			System.out.println("Introduce la calificacion del alumno: ");
			num = scanner.nextInt();

			if (num < 5) {
				contador++;
			}
		}

		// Respuesta
		if (contador != 0) {
			System.out.println("Hay " + contador + " supensos");
		} else {
			System.out.println("No hay suspensos");
		}

		scanner.close(); // Cerramos el scanner
	}

}
