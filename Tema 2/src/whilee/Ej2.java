package whilee;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// Configuramos el scanner
		Scanner scanner = new Scanner(System.in);
		
		// Variables
		int contador = 0;
		int numero;

		// Pedir al usuario números hasta que introduzca un número negativo
		while (true) {
			System.out.println("Introduce un número entero positivo (o un número negativo para terminar):");
			numero = scanner.nextInt();

			if (numero < 0) {
				break; // Salir del bucle si el número es negativo
			}

			contador++; // Incrementar el contador por cada número positivo introducido
		}

		// Mostrar la cantidad de números positivos introducidos
		System.out.println("La cantidad de números positivos introducidos es: " + contador);

		// Cerramos el scanner
		scanner.close();
	}

}
