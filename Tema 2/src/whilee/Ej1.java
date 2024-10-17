package whilee;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// Configuramos el scanner
		Scanner scanner = new Scanner(System.in);

		// Variables
		int suma = 0;
		int numero;

		// Empieza a pedir numeros
		System.out.println("Introduce un número entero positivo (o un número negativo para terminar):");
		numero = scanner.nextInt();
		
		// Pedir al usuario números hasta que introduzca un número negativo
		while (numero >= 0) {
			
			suma += numero; // Sumar el número a la suma total

			System.out.println("Introduce un número entero positivo (o un número negativo para terminar):");
			numero = scanner.nextInt();
		}

		// Mostrar la suma total de los números positivos introducidos
		System.out.println("La suma de los números positivos introducidos es: " + suma);

		// Cerramos el scanner
		scanner.close(); 
	}

}
