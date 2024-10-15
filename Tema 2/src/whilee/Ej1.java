package whilee;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// Configuramos el scanner
		Scanner scanner = new Scanner(System.in); 
		
		// Variables
		int suma = 0;
		int numero;

		// Pedir al usuario números hasta que introduzca un número negativo
		while (true) {
			System.out.println("Introduce un número entero positivo (o un número negativo para terminar):");
			numero = scanner.nextInt();

			if (numero < 0) {
				break; // Salir del bucle si el número es negativo
			}

			suma += numero; // Sumar el número a la suma total
		}

		// Mostrar la suma total de los números positivos introducidos
		System.out.println("La suma de los números positivos introducidos es: " + suma);

		// Cerramos el scanner
		scanner.close(); // Cierra el bucle
	}

}
