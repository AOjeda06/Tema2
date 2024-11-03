package anteriores;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		// Configuramos el scanner
		Scanner scanner = new Scanner(System.in);

		// Variable para la proporcion de los escaques
		int tamaño;

		// Variable para saber si la fila de escaques comienza en blanco o negro
		boolean white = true;

		// Pide valor para tamaño y lo guarda
		System.out.println("Indique el tamaño de los escaques: ");
		tamaño = scanner.nextInt();

		// Siempre se va a repetir el bucle 8 veces para que sea de 8x8 (64)
		for (int i = 1; i <= 8; i++) {
			// Comprueba si empieza en blanco o negro
			if (white) {
				// Este for controla la altura de los escaques
				for (int j = 1; j <= tamaño; j++) {
					// Este for controla y escribe el ancho de la linea con espacios o #
					for (int p = 1; p <= tamaño; p++) {
						for (int h = 1; h <= tamaño; h++) {
							System.out.print(" ");
						}
						// Este for controla y escribe el ancho de la linea con espacios o #
						for (int k = 1; k <= tamaño; k++) {
							System.out.print("#");
						}
					}
					// Salta a la siguiente linea
					System.out.println();
				}
				// La siguiente fila de escaques será distina a ésta
				white = false;
				// Este else es para las linea que empiezan por #, y funciona exactamente igual
				// que el otro
			} else {
				for (int m = 1; m <= tamaño; m++) {
					for (int q = 1; q <= tamaño; q++) {
						for (int n = 1; n <= tamaño; n++) {
							System.out.print("#");
						}
						for (int o = 1; o <= tamaño; o++) {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				white = true;
			}

		}
		// Cerramos el scanner
		scanner.close();
	}

}
