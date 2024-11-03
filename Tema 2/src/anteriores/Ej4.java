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

		// Fijamos el contador de iteraciones en uno para la primera iteración
		contador = 1;

		// Fijamos suma en 0 porque la primera iteración escribirá "lado" asteriscos y
		// no más
		suma = 0;

		// Delimitamos el margen de la izquierda
		espacio = lado - 1;

		// Bucle que se repetirá ("lado" x 2) - 1 veces
		for (int i = 1; i <= ((lado * 2) - 1); i++) {
			// Lado1 será el valor base de "lado" más los que se le deben añadir para la
			// iteración en cuestión
			lado1 = (lado + suma);

			// Este if es para la mitad de arriba del hexágono
			if (contador < lado) {
				// Este for escribe el margen de la izquierda del hexágono en cada línea
				for (int j = espacio; j > 0; j--) {
					System.out.print(" ");
				}
				// Este for escribe los asteriscos de cada línea
				for (int k = 1; k <= lado1; k++) {
					System.out.print("*");
				}
				// Actualizamos el contador (+1), la suma (2 asteriscos más en la siguiente
				// línea) y el espacio a la izquierda (-1), y saltamos de línea para la
				// siguiente iteracion
				contador++;
				suma += 2;
				espacio--;
				System.out.println();
				// Este if es para la línea de la mitad del hexágono
			} else if (contador == lado) {
				// Escribe los asteriscos correspondientes y en esta línea no hay espacio a la
				// izquierda
				for (int k = 1; k <= lado1; k++) {
					System.out.print("*");
				}
				contador++;
				// Empieza a decrementar aquí para preparar la próxima línea la suma y a
				// aumentar el espacio de nuevo
				suma -= 2;
				espacio++;
				System.out.println();
				// Este else será la mitad restante del hexágono
			} else {
				// Este for escribirá los espacios del margen de la izquierda
				for (int j = espacio; j > 0; j--) {
					System.out.print(" ");
				}
				// Este for escribirá los asteriscos de la línea correspondiente
				for (int k = 1; k <= lado1; k++) {
					System.out.print("*");
				}
				// El contador aumenta (+1), la suma disminuye (-2) y el margen de la izquierda
				// aumenta
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
