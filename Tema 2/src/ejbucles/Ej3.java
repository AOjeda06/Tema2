package ejbucles;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// Configuramos el scanner
		Scanner scanner = new Scanner(System.in);

		// Variables
		int a, b, menor, mcd;

		// Solicitar al usuario los dos números
		System.out.println("Introduce el primer número:");
		a = scanner.nextInt();

		System.out.println("Introduce el segundo número:");
		b = scanner.nextInt();

		// Calcular el menor de los dos números
		menor = Math.min(a, b);
		
		// Establecemos 1 como mcd por defecto hasta que se demuestre uno mayor
		mcd = 1;

		// Algoritmo para encontrar el MCD
		// Fijamos i en el menor de los dos numeros y lo vamos decrementando hasta 0
		for (int i = menor; i > 0; i--) {
			// Si el modulo de a/i y de b/i son iguales a 0, se habrá encontrado un máximo divisor común y se cortará el bucle
			if (a % i == 0 && b % i == 0) {
				mcd = i;
				break;
			}
		}

		// Mostrar el resultado
		System.out.println("El máximo común divisor de " + a + " y " + b + " es: " + mcd);

		// Cerramos el scanner
		scanner.close();
	}

}
