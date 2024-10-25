package ejbucles;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Creamos el scanner

		// Variables
		int num;
		int contador = 0;
		boolean esPrimo;

		// Pide datos
		System.out.println("Di un numero mayor que 1: ");
		num = scanner.nextInt();

		// Bucle para comprobar
		for (int i = 2; i <= num; i++) {
			esPrimo = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					esPrimo = false;
					break;
				}
			}

			if (esPrimo) {
				contador++;
			}
		}
		if (contador != 0) {
			System.out.println("Hay " + contador + " numero primos");
		} else {
			System.out.println("No hay numeros primos");
		}

		scanner.close(); // Cerramos el scanner

	}
}
