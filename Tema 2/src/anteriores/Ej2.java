package anteriores;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// Configuramos el scanner
		Scanner scanner = new Scanner(System.in);

		// Variables
		int num;
		int temp;
		int cifras = 0;
		int prueba;
		boolean esPar;

		do {
			// Pide el numero y guarda el valor
			System.out.println("Escribe un numero: ");
			num = scanner.nextInt();
		} while (num < 0);

		if (num ==0) {
			System.out.println("0 es par.");
			System.exit(0);
		}
		
		// Asignamos a temp el valor de num
		temp = num;

		// Contamos las cifras de temp dividiendolo entre 10 hasta que de 0
		for (int i = 1; temp != 0; i++) {
			temp /= 10;
			cifras++;
		}

		// Repetimos "cifras" veces el bucle, sacando en cada iteración una cifra
		// dividiendo por 10^j y %10 para quitar las cifras indeseadas a la izquierda
		for (int j = 0; j < cifras; j++) {
			prueba = (num / (int) Math.pow(10, j)) % 10;
			if (prueba % 2 == 0) {
				esPar = true;
			} else {
				esPar = false;
			}
			// Escribe si es par o impar la cifra en cuestion
			if (esPar) {
				System.out.println(prueba + " es par.");
			} else {
				System.out.println(prueba + " es impar.");

			}
		}

		// Cerramos el scanner
		scanner.close();
	}

}
