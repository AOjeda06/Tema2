package whilee;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// Configuramos el scanner
		Scanner scanner = new Scanner(System.in);

		// Variables
		int sumaNegativos = 0;
		int contadorNegativos = 0;
		int contadorCeros = 0;
		int sumaPositivos = 0;
		int contador = 0;
		int numero;

		// Pedir al usuario números hasta que introduzca un número negativo
		while (contador <= 10) {
			System.out.println("Introduce un número entero positivo, cero ó un número negativo:");
			numero = scanner.nextInt();

			if (numero < 0) {
				sumaNegativos += numero;
				contadorNegativos++;
			}
			if (numero == 0) {
				contadorCeros++;
			}
			if (numero > 0) {
				sumaPositivos += numero;
			}

			contador++; // Incrementar el contador
		}

		// Respuestas 
	
		System.out.println("La suma de los numeros positivos introducidos es: " + sumaPositivos);
		System.out.println("El numero de ceros introducidos es: " + contadorCeros);
		if (contadorNegativos > 0) {
			System.out.println("La media de los números negativos introducidos es: "
					+ ((double) sumaNegativos / contadorNegativos));
		} else {
			System.out.println("No se introdujeron números negativos.");
		}

		// Cerramos el scanner
		scanner.close();
	}

}
