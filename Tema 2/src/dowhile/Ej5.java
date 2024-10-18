package dowhile;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Configurar scanner

		// Variables
		int min = 1;
		int max = 100;
		int intento;
		String respuesta;

		System.out.println("Piensa en un número del 1 al 100 y el ordenador intentará adivinarlo.");

		do {
			intento = (min + max) / 2; // El ordenador intenta adivinar el número
			System.out.println("¿Es " + intento + "? (responde 'mayor', 'menor' o 'igual')");
			respuesta = scanner.nextLine();

			if (respuesta.equalsIgnoreCase("mayor")) {
				min = intento + 1; // Ajustar el rango mínimo
			} else if (respuesta.equalsIgnoreCase("menor")) {
				max = intento - 1; // Ajustar el rango máximo
			}
		} while (!respuesta.equalsIgnoreCase("igual")); // Continuar hasta que el ordenador adivine el número

		System.out.println("¡El ordenador ha adivinado tu número: " + intento + "!");

		scanner.close(); // Cierra el scanner
	}

}
