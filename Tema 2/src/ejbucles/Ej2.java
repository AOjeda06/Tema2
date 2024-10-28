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

		// Bucle
		// Comprueba todos los numeros desde 2 hasta el numero introducido
		for (int i = 2; i <= num; i++) {
			// Suponemos true hasta que se demuestre lo contrario
			esPrimo = true;
			/* Comprobamos el resto de i/j, siendo j los números desde 2 hasta la raiz
			cuadrada de i (podria usarse tambien i/2)*/
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					esPrimo = false;
					break;
				}
			}
			/* Si no se demuestra que no es primo, suma al contador de numeros entre 1 y num
			que son primos*/
			if (esPrimo) {
				contador++;
			}
		}

		// Respuesta del programa
		if (contador != 0) {
			System.out.println("Hay " + contador + " numero primos");
		} else {
			System.out.println("No hay numeros primos");
		}

		scanner.close(); // Cerramos el scanner

	}
}
