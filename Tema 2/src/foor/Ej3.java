package foor;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Creamos el scanner

		// Declaramos variables
		int num, total = 0;

		// Bucle
		for (int i = 1; i <= 10; i++) {

			// Pide el numero y guarda la respuesta
			System.out.println("Dime un numero: ");
			num = scanner.nextInt();

			// Almacena los valores
			total += num;

		}
		System.out.println("La media es: " + (total / 10));
		scanner.close(); // Cerramos el scanner

	}

}
