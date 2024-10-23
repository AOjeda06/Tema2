package foor;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Creamos el scanner

		// Declaramos variables
		long num, factorial = 1;

		// Pide el numero y guarda la respuesta
		System.out.println("Dime un numero: ");
		num = scanner.nextInt();

		// Bucle
		for (int i = 1; i <= num; i++) {
			factorial *= i;

		}
		System.out.println("El factorial de " + num + " es: " + factorial);
		scanner.close(); // Cerramos el scanner
	}

}
