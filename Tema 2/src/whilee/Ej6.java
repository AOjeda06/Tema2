package whilee;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		// Configurar el scanner
		Scanner scanner = new Scanner(System.in);
		
		// Variables
		int altura, maxAltura = 0;

		// Pedir al usuario alturas hasta que introduzca -1
		while (true) {
			System.out.println("Introduce la altura del árbol en centímetros (o -1 para terminar):");
			altura = scanner.nextInt();

			if (altura == -1) {
				break; // Salir del bucle si la altura es -1
			}

			if (altura > maxAltura) {
				maxAltura = altura; // Actualizar la altura máxima si la actual es mayor
			}
		}

		// Mostrar la altura del árbol más alto
		System.out.println("La altura del árbol más alto es: " + maxAltura + " cm");

		// Cerramos el scanner
		scanner.close();
	}

}
