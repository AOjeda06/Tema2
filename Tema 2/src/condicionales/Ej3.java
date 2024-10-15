package condicionales;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Configuramos el scanner

		// Variables
		int dni;
		char letra = ' ';

		System.out.println("Introduce un número de DNI (8 dígitos):"); // Pide el numero
		dni = scanner.nextInt(); // lee el teclado

		if (dni < 0 || dni > 99999999) { // Calcula si es valido
			System.out.println("El número de DNI está fuera del rango permitido.");
		} else {
			int indice = dni % 23; // Calcula la letra

			switch (indice) {
			case 0:
				letra = 'T';
				break;
			case 1:
				letra = 'R';
				break;
			case 2:
				letra = 'W';
				break;
			case 3:
				letra = 'A';
				break;
			case 4:
				letra = 'G';
				break;
			case 5:
				letra = 'M';
				break;
			case 6:
				letra = 'Y';
				break;
			case 7:
				letra = 'F';
				break;
			case 8:
				letra = 'P';
				break;
			case 9:
				letra = 'D';
				break;
			case 10:
				letra = 'X';
				break;
			case 11:
				letra = 'B';
				break;
			case 12:
				letra = 'N';
				break;
			case 13:
				letra = 'J';
				break;
			case 14:
				letra = 'Z';
				break;
			case 15:
				letra = 'S';
				break;
			case 16:
				letra = 'Q';
				break;
			case 17:
				letra = 'V';
				break;
			case 18:
				letra = 'H';
				break;
			case 19:
				letra = 'L';
				break;
			case 20:
				letra = 'C';
				break;
			case 21:
				letra = 'K';
				break;
			case 22:
				letra = 'E';
				break;
			}

			System.out.println("La letra correspondiente al DNI " + dni + " es: " + letra); // Devuelve la respuesta
		}

		scanner.close(); // Cierra el scanner

	}

}