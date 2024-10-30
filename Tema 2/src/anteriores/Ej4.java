package anteriores;

import java.util.Scanner;

public class Ej4 {
	public static void main(String[] args) {
		// Configuramos el scanner
		Scanner scanner = new Scanner(System.in);

		// Variables
		int lado;
		int contador;
		int lado1;
		int suma;
		int espacio;

		// Pide el valor y lo guarda
		System.out.println("¿Cuál será la proporción del hexágono?: ");
		lado = scanner.nextInt();
		contador = 1;
		suma = 0;
		espacio = lado - 1;

		// Bucle que se repetirá "lado" veces
		for (int i = 1; i <= ((lado * 2) - 1); i++) {
			lado1 = (lado + suma);

			if (contador < lado) {
				for (int j = espacio; j > 0; j--) {
					System.out.print(" ");
				}
				for (int k = 1; k <= lado1; k++) {
					System.out.print("*");
				}
				contador++;
				suma += 2;
				espacio--;
				System.out.println();
			} else if (contador == lado) {
				for (int k = 1; k <= lado1; k++) {
					System.out.print("*");
				}
				contador++;
				suma -= 2; // Empieza a decrementar aquí para preparar la próxima línea
				espacio++;
				System.out.println();
			} else {
				for (int j = espacio; j > 0; j--) {
					System.out.print(" ");
				}
				for (int k = 1; k <= lado1; k++) {
					System.out.print("*");
				}
				contador++;
				suma -= 2;
				espacio++;
				System.out.println();
			}
		}

		// Cerramos el scanner
		scanner.close();
	}
}
