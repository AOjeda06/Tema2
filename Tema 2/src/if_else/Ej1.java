package if_else;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		int a; // Numero a introducir

		Scanner scanner = new Scanner(System.in); // Configuramos el scanner

		System.out.println("Introduce un número"); // Pide un numero

		a = scanner.nextInt(); // Lee el teclado

		if (a % 2 == 0) { // Creamos el condicional
			System.out.println(a + " es par");
		} else { // La alternativa condicional
			System.out.println(a + " es impar");
		}

		scanner.close(); // Cierra el scanner

	}

}
