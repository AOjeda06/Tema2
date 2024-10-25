package ejbucles;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		// Configuramos el scanner
		Scanner scanner = new Scanner(System.in);

		// Variables
		int proporcion;

		System.out.println("Introduce un numero para las medidas del triangulo");
		proporcion = scanner.nextInt();

		// Dibujar el triángulo equilátero
		for (int i = 1; i <= proporcion; i++) {
			// Imprimir espacios en blanco para centrar los asteriscos
			for (int j = 1; j <= proporcion - i; j++) {
				System.out.print(" ");
			}
			// Imprimir los asteriscos
			for (int j = 1; j <= i; j++) {
				System.out.print("* "); // Evita que se amontonten gracias al espacio a la derecha
			}
			System.out.println(); // Saltar a la siguiente línea
		}

		// Cerramos el scanner
		scanner.close();
	}

}