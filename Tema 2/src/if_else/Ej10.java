package if_else;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Configuramos el scanner

		int num1, num2, num3; // Declaramos las variables 

		// Pedir al usuario tres números enteros
		System.out.println("Introduce el primer número:");
		num1 = scanner.nextInt();

		System.out.println("Introduce el segundo número:");
		num2 = scanner.nextInt();

		System.out.println("Introduce el tercer número:");
		num3 = scanner.nextInt();

		// Comprobar si la suma de dos números es igual al tercer número
		if (num1 + num2 == num3) {
			System.out.println("La suma de " + num1 + " y " + num2 + " es igual a " + num3);
		} else if (num1 + num3 == num2) {
			System.out.println("La suma de " + num1 + " y " + num3 + " es igual a " + num2);
		} else if (num2 + num3 == num1) {
			System.out.println("La suma de " + num2 + " y " + num3 + " es igual a " + num1);
		} else {
			System.out.println("Ninguna suma de dos números es igual al tercer número.");
		}

		scanner.close(); // Cerramos el scanner
	}

}
