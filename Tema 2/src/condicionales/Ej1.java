package condicionales;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		boolean esCapicua = false; // Creamos un booleano para saber si es capicua
		int numero; // Una variable para el numero introducido
		Scanner scanner = new Scanner(System.in); // Configuramos el scanner
		System.out.println("Introduce un número entre 0 y 9999:"); // Pide el numero
		numero = scanner.nextInt(); // Lee el teclado y asigna el valor al numero

		if (numero < 0 || numero > 9999) { // Comprobamos que esta dentro del rango
			System.out.println("El número está fuera del rango permitido.");
		} else { // Comprobamos las posibilidades
			if (numero < 10) {
				esCapicua = true;
			} else if (numero < 100) {
				esCapicua = (numero / 10) == (numero % 10);
			} else if (numero < 1000) {
				esCapicua = (numero / 100) == (numero % 10);
			} else {
				esCapicua = (numero / 1000) == (numero % 10) && ((numero / 100) % 10) == ((numero / 10) % 10);
			}

			if (esCapicua) { // Dice si es o no capicua basandose en el valor del booleano
				System.out.println("El número " + numero + " es capicúa.");
			} else {
				System.out.println("El número " + numero + " no es capicúa.");
			}
		}
		scanner.close(); // Cierra el scanner
	}

}
