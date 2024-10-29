package anteriores;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// Configuramos el scanner
		Scanner scanner = new Scanner(System.in);

		// Variable
		int lado;

		// Pide valor y lo almacena
		System.out.println("Cuánto mide el lado del cuadrado?: ");
		lado = scanner.nextInt();

		// Bucle
		// Este bucle se repite "lado" veces
		for (int i = 1; i <= lado; i++) {
			// Si se trata de la primera o última linea imprime "lado" asteriscos
			if (i == 1 || i == lado) {
				for (int j = 1; j <= lado; j++) {
					System.out.print("*");
				}
				System.out.println();
				continue;
				// Si no se trata de la primera ni la ultima fila imprime dos astericos con
				// "lado"-2 espcios entre ellos
			}
			if (i != 1 || i != lado) {
				System.out.print("*");
				for (int h = 1; h <= lado - 2; h++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
				continue;
			}
		}

		// Cerramos el scanner
		scanner.close();
	}

}
