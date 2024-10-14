package condicionales;

import java.util.Random;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Configuramos el scanner
		Random random = new Random(); // Configuramos el random

		// Generar dos números aleatorios entre 1 y 99
		int numero1 = random.nextInt(99) + 1;
		int numero2 = random.nextInt(99) + 1;

		int resultadoUsuario; // Variable para el resultado del usuario
		int resultadoCorrecto; // Variable para el resultado correcto

		System.out.println("Suma los siguientes números:");
		System.out.println(numero1 + " + " + numero2);

		// Pedir al usuario que introduzca el resultado
		System.out.print("Introduce el resultado de la suma: ");
		resultadoUsuario = scanner.nextInt();

		// Calcular el resultado correcto
		resultadoCorrecto = numero1 + numero2;

		// Comprobar si el resultado es correcto
		if (resultadoUsuario == resultadoCorrecto) {
			System.out.println("¡Correcto! El resultado es " + resultadoCorrecto + ".");
		} else {
			System.out.println("Incorrecto. El resultado correcto es " + resultadoCorrecto + ".");
		}

		scanner.close(); // Cierra el escaner
	}

}
