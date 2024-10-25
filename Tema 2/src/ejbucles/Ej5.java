package ejbucles;

import java.util.Scanner;

public class Ej5 {

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
			for (int i = 1; i <= num; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(i);
				}
				System.out.println(); // Para saltar a la siguiente línea después de cada fila
			}
		}

		// Cerramos el scanner
		scanner.close();
	}

}
