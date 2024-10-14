package condicionales;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Configuramos el scanner
		int dni; // declaramos la variable para los numeros del dni
		char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
				'L', 'C', 'K', 'E' }; // Creamos un array con todas las letras posibles en orden
		int indice; // Esta variable indicará la posición de la letra dentro del array que necesitamos
		char letra; // Esta variable guarda la letra del array con la que nos vamos a quedar

		System.out.println("Introduce un número de DNI (8 dígitos):"); // Pide el numero
		dni = scanner.nextInt(); // Lee el teclado

		if (dni < 0 || dni > 99999999) { // Calcula que el numero es valido
			System.out.println("El número de DNI está fuera del rango permitido.");
		} else {
			indice = dni % 23; // Calcula el módulo para hallar la posicion dentro del array
			letra = letras[indice];
			System.out.println("La letra correspondiente al DNI " + dni + " es: " + letra);
		}
		scanner.close(); // Cierra el scanner

	}

}