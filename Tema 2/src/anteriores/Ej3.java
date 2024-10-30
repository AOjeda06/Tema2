package anteriores;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// Configuramos el scanner
		Scanner scanner = new Scanner(System.in);

		// Variables
		int lado;

		// Pide el valor y lo guarda:
		System.out.println("¿Cuál será la proporción del triangulo?: ");
		lado = scanner.nextInt();

		// Bucle que se repetirá "lado" veces
		for (int i = 1; i <= lado; i++) {
			// If para la base de la pirámide
			if (i == 1) {
				for (int j = 1; j <= lado; j++) {
					System.out.print("* ");
				}
			}
			// If para la última fila
			if (i == lado) {
				break;
			}
			// Espacios a la izquierda
			System.out.println();
			for (int h = 1; h <= i; h++) {
				System.out.print(" ");
			}
			// Asterisco de la izquierda
			System.out.print("*");
			// Espacios a la derecha y asterisco a la derecha
			for (int k = lado - 1; k >= i + 1; k--) {
				if (k == i + 1) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}

		}
		// Cerramos el scanner
		scanner.close();
	}

}
