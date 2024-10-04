package if_else;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		int num1, num2; // Numeros a introducir

		Scanner scanner = new Scanner(System.in); // Configuramos el scanner

		System.out.println("Introduce un número"); // Pide un numero

		num1 = scanner.nextInt(); // Lee el teclado

		System.out.println("Introduce otro número"); // Pide otro numero

		num2 = scanner.nextInt(); // Lee el teclado

		if (num1 == num2) { // Creamos el condicional que compara los valores
			System.out.println(num1 + " y " + num2 + " son iguales");
		} else { // La alternativa si devuelve false
			System.out.println(num1 + " y " + num2 + " no son iguales");
		}

		scanner.close(); // Cierra el scanner

	}
}
