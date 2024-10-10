package condicionales;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dni;
		char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
				'L', 'C', 'K', 'E' };
		int indice;
		char letra;

		System.out.println("Introduce un número de DNI (8 dígitos):");
		dni = scanner.nextInt();

		if (dni < 0 || dni > 99999999) {
			System.out.println("El número de DNI está fuera del rango permitido.");
		} else {
			indice = dni % 23;
			letra = letras[indice];
			System.out.println("La letra correspondiente al DNI " + dni + " es: " + letra);
		}
		scanner.close(); // Cierra el scanner

	}

}
