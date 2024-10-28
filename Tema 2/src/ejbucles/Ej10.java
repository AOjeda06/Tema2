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
		int numero;

		// Solicitar al usuario un número
		System.out.println("Introduce un número:");
		numero = scanner.nextInt();

		// Convertir el número a una cadena de texto y la cantidad de caracteres a un string
		numeroStr = Integer.toString(numero);
		longitud = numeroStr.length();

		// Bucle
		// Fijamos i en 0, y repetimos hasta la mitad del numero de cifras que tenga el numero
		for (int i = 0; i < longitud / 2; i++) {
			/* Si el numero en la posición i del String, no es igual al numero en la posición longitud - i -1
			el numero no será capicua*/
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
