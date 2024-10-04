package if_else;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Creamos el scanner
		int numero; // Creamos la variable para almacenar el numero introducido
		System.out.println("Introduce un número entre 0 y 10:"); // Pide el numero
		numero = scanner.nextInt(); // Lee el teclado

		if (numero < 0 || numero > 10) { // Comprueba que el numero esta dentro del rango establecido
			System.out.println("El número está fuera del rango permitido.");
		} else {
			if (numero == 10 || numero == 9) { // Comprueba si es sobresaliente
				System.out.println("Sobresaliente");
			} else if (numero == 8 || numero == 7) { // Comprueba si es notable
				System.out.println("Notable");
			} else if (numero == 6) { // Comprueba si es bien
				System.out.println("Bien");
			} else if (numero == 5) { // Comprueba si es suficiente
				System.out.println("Suficiente");
			} else { // Solo queda la opcion de que sea suspenso
				System.out.println("Insuficiente");
			}
		}
		scanner.close(); // Cerramos el scanner
	}

}
