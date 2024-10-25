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
		mcd = 1;

		// Algoritmo para encontrar el MCD
		for (int i = menor; i > 0; i--) {
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
