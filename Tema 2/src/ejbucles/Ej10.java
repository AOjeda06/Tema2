package ejbucles;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		// Configuramos el scanner
		Scanner scanner = new Scanner(System.in);

		// Variables
		boolean esCapicua = true;
		int numero = 0;
		int longitud = 0;
		int original;
		int leftDigit;
		int rightDigit;

		// Solicitar al usuario un número
		try {
			// Solicitar al usuario un número
			System.out.println("Introduce un número:");
			numero = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("Error: se ha introducido un valor no válido. Por favor, introduce un número entero.");
		} finally {
			scanner.close();
			System.out.println("El bloque finally se ha ejecutado.");
		}

		original = numero;

		// Contar el número de cifras
		int tempNum = numero;
		while (tempNum != 0) {
			tempNum /= 10;
			longitud++;
		}

		// Bucle para comprobar si es capicúa
		for (int i = 0; i < longitud / 2; i++) {
			/*
			 * Calcula numero dividido 10 elevado a (longitud-1-i); eliminando todas las
			 * cifras a la derecha de la deseada y luego hace modulo 10 para eliminar
			 * posibles cifras no deseadas a la izquierda de la deseada. Hay que hacer un
			 * cast a int para truncar el numero.
			 */
			leftDigit = (numero / (int) Math.pow(10, longitud - 1 - i)) % 10;
			rightDigit = (numero / (int) Math.pow(10, i)) % 10;

			if (leftDigit != rightDigit) {
				esCapicua = false;
				break;
			}
		}

		// Mostrar el resultado
		if (esCapicua) {
			System.out.println("El número " + original + " es capicúa.");
		} else {
			System.out.println("El número " + original + " no es capicúa.");
		}

		// Cerramos el scanner
		scanner.close();
	}

}
