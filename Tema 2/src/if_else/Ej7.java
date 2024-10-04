package if_else;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Creamos el scanner
		int numero; // Creamos la variable para almacenar el numero introducido
		System.out.println("Introduce un número entre 0 y 99999:"); // Pide el numero
		numero = scanner.nextInt(); // Lee el teclado

		if (numero < 0 || numero > 99999) { // Comprueba que el numero esta dentro del rango establecido
			System.out.println("El número está fuera del rango permitido.");
		} else {
			if (numero < 10) { // Comprueba si tiene una cifra
				System.out.println("El número tiene 1 cifra.");
			} else if (numero < 100) { // Comprueba si tiene dos cifras
				System.out.println("El número tiene 2 cifras.");
			} else if (numero < 1000) { // Comprueba si tiene tres cifras
				System.out.println("El número tiene 3 cifras.");
			} else if (numero < 10000) { // Comprueba si tiene cuatro cifras
				System.out.println("El número tiene 4 cifras.");
			} else { // Solo queda la opcion de que tenga cinco cifras
				System.out.println("El número tiene 5 cifras.");
			}
		}
		scanner.close(); // Cerramos el scanner

	}

}
