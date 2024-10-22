package foor;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Creamos el scanner

		// Declaramos variables
		int num;

		// Pide el numero y guarda la respuesta
		System.out.println("Dime un numero: ");
		num = scanner.nextInt();

		// Bucle
		for (int i = 0; i <= num; i += 3) {
			System.out.println(i);

		}
		scanner.close(); // Cerramos el scanner
	}

}
