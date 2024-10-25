package ejbucles;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Variables
		int a, b, max, mcm;

		// Solicitar al usuario los dos números
		System.out.println("Introduce el primer número:");
		a = scanner.nextInt();

		System.out.println("Introduce el segundo número:");
		b = scanner.nextInt();

		// Encontrar el mayor de los dos números
		max = Math.max(a, b);
		mcm = max;

		// Incrementar hasta encontrar el primer múltiplo común
		while (mcm % a != 0 || mcm % b != 0) {
			mcm++;
		}

		// Mostrar el resultado
		System.out.println("El mínimo común múltiplo de " + a + " y " + b + " es: " + mcm);

		// Cerramos el scanner
		scanner.close();
	}

}
