package swich;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Creamos el scanner

		String tirada; // Variable para el numero en letras
		int tirada1, tirada2; // Variables para los numeros sacados en cada tirada
		int suma; // Variable para la suma

		// Pide y lee el resultado de la primera tirada
		System.out.println("Dime el resultado numerico de la primera tirada en mayúsculas: ");
		tirada = scanner.nextLine();

		switch (tirada) { // Contempla las posibilidades y la validez de la tirada
		case "UNO":
			tirada1 = 1;
			break;
		case "DOS":
			tirada1 = 2;
			break;
		case "TRES":
			tirada1 = 3;
			break;
		case "CUATRO":
			tirada1 = 4;
			break;
		case "CINCO":
			tirada1 = 5;
			break;
		case "SEIS":
			tirada1 = 6;
			break;
		default:
			tirada1 = -1;
			break;
		}

		// Pide y lee el resultado de la segunda tirada
		System.out.println("Dime el resultado numerico de la primera segunda en mayúsculas: ");
		tirada = scanner.nextLine();

		switch (tirada) { // Contempla las posibilidades y la validez de la tirada
		case "UNO":
			tirada2 = 1;
			break;
		case "DOS":
			tirada2 = 2;
			break;
		case "TRES":
			tirada2 = 3;
			break;
		case "CUATRO":
			tirada2 = 4;
			break;
		case "CINCO":
			tirada2 = 5;
			break;
		case "SEIS":
			tirada2 = 6;
			break;
		default:
			tirada2 = -1;
			break;
		}

		// Calcula si tiene solucion y si la tiene la imprime por pantalla
		if (tirada1 != -1 && tirada2 != -1) {
			suma = tirada1 + tirada2;
			System.out.println("La suma de las dos tiradas es: " + suma);
		} else {
			System.out.println("Entrada inválida. Asegúrate de introducir los valores correctamente.");
		}
		scanner.close(); // Cerramos el scanner

	}

}
