package dowhile;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Creamos el scanner
		int num1, num2; // Creamos las variables para almacenar los números introducidos
		char opcion; // Creamos la variable para la opción
		double suma; // Declaramos la variable suma
		double resta; // Declaramos la variable resta
		double multiplicacion; // Declaramos la variable multiplicacion
		double division; // Declaramos la variable division
		boolean play=true; // Declaramos la variable que hace que el juego se repita hasta salir

		do {
		System.out.println("Introduce un número:"); // Pide el número
		num1 = scanner.nextInt(); // Lee el teclado
		System.out.println("Introduce otro número:"); // Pide el número
		num2 = scanner.nextInt(); // Lee el teclado

		// Limpiamos el scanner
		scanner.nextLine();

		suma = (double) num1 + num2; // Calcula el valor de suma
		resta = (double) num1 - num2; // Calcula el valor de resta
		multiplicacion = (double) num1 * num2; // Calcula el valor de multiplicacion
		division = num2 != 0 ? (double) num1 / num2 : Double.NaN; // Calcula el valor de division tras comprobar que es
																	// realizable

		System.out.println("Escoja una opción: " + "\r\n" + "A. SUMAR LOS NÚMEROS\r\n" + "B. RESTAR LOS NÚMEROS\r\n"
				+ "C. MULTIPLICAR LOS NÚMEROS\r\n" + "D. DIVIDIR LOS NÚMEROS\r\n" + "E. SALIR\\r\\n");

		opcion = scanner.nextLine().charAt(0);

		switch (opcion) {
		case 'A' -> { // Sumar
			System.out.println("El resultado es: " + suma);
		}
		case 'B' -> { // Restar
			System.out.println("El resultado es: " + resta);
		}
		case 'C' -> { // Multiplicar
			System.out.println("El resultado es: " + multiplicacion);
		}
		case 'D' -> { // Dividir
			if (num2 != 0) {
				System.out.println("El resultado es: " + division);
			} else {
				System.out.println("No se puede dividir por cero.");
			}
		}
		case 'E' -> {
			play = false;
		}
		default -> { // Opcion no valida
			System.out.println("Opción no válida");
		}
		}
		} while (play);
		scanner.close(); // Cerramos el scanner
	}

}
