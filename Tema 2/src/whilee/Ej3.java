package whilee;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// Configuramos el scanner
		Scanner scanner = new Scanner(System.in);
		
		// Variables
		int suma = 0;
		int contador = 0;
		int numero;

		// Pedir al usuario números hasta que introduzca un número negativo
		while (true) {
			System.out.println("Introduce un número entero positivo (o un número negativo para terminar):");
			numero = scanner.nextInt();

			if (numero < 0) {
				break; // Salir del bucle si el número es negativo
			}

			suma += numero; // Sumar el número a la suma total
			contador++; // Incrementar el contador por cada número positivo introducido
		}

		// Calcular la media de los números positivos introducidos
		if (contador > 0) {
			double media = (double) suma / contador;
			System.out.println("La media de los números positivos introducidos es: " + media);
		} else {
			System.out.println("No se han introducido números positivos.");
		}

		// Cerramos el scanner
		scanner.close();
	}

}
