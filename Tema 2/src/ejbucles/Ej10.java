package ejbucles;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		// Configuramos el scanner
		Scanner scanner = new Scanner(System.in);

		// Variables
		boolean esCapicua = true;
		int longitud;
		String numeroStr;

		// Solicitar al usuario un número
		System.out.println("Introduce un número:");
		int numero = scanner.nextInt();

		// Convertir el número a una cadena de texto
		numeroStr = Integer.toString(numero);
		longitud = numeroStr.length();

		// Comprobar si es capicúa usando un bucle
		for (int i = 0; i < longitud / 2; i++) {
			if (numeroStr.charAt(i) != numeroStr.charAt(longitud - 1 - i)) {
				esCapicua = false;
				break;
			}
		}

		// Mostrar el resultado
		if (esCapicua) {
			System.out.println("El número " + numero + " es capicúa.");
		} else {
			System.out.println("El número " + numero + " no es capicúa.");

		}

		// Cerramos el scanner
		scanner.close();
	}

}
