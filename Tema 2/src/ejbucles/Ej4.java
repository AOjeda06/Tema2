package ejbucles;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// Configuramos el scanner
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
		
		// Fijamos el mcm en el valor del mayor de los dos numeros
		mcm = max;

		// Bucle
		/* Repite hasta que: el modulo del mayor de los dos numero o entre sí o entre el otro número, sea distinto de cero
		y se le suma 1 a mcm, cuando el modulo sea 0 en ambos se habrá encontrado el primer multiplo comun de ambos */
		while (mcm % a != 0 || mcm % b != 0) {
			mcm++;
		}

		// Mostrar el resultado
		System.out.println("El mínimo común múltiplo de " + a + " y " + b + " es: " + mcm);

		// Cerramos el scanner
		scanner.close();
	}

}
