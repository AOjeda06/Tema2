package ejbucles;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		// Configuramos el scanner
		Scanner scanner = new Scanner(System.in);

		// Variables
		int num;

		// Pide el numero y guarda el valor
		System.out.println("Escribe un numero entre 1 y 20");
		num = scanner.nextInt();

		// Comprueba la validez y si es valido comienza el bucle
		if (num < 1 || num > 20) {
			System.out.println("Numero no valido");
		} else {
			// Fijamos i en 1 y repetimos hasta i = num
			for (int i = 1; i <= num; i++) {
				// Fijamos j en 1, y repetimos hasta i
				for (int j = 1; j <= i; j++) {
					System.out.print(j);
				}
				// Fijamos h en i-1 y repetimos hasta 1
				for (int h = (i - 1); h >= 1; h--) {
					System.out.print(h);
				}
				// Para saltar a la siguiente línea después de cada fila
				System.out.println();
			}
		}

		// Cerramos el scanner
		scanner.close();
	}

}
