package if_else;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		int num1, num2, num3; // Numeros a introducir

		Scanner scanner = new Scanner(System.in); // Configuramos el scanner

		System.out.println("Introduce un número"); // Pide un numero

		num1 = scanner.nextInt(); // Lee el teclado

		System.out.println("Introduce otro número"); // Pide otro numero

		num2 = scanner.nextInt(); // Lee el teclado

		System.out.println("Introduce otro número"); // Pide otro numero

		num3 = scanner.nextInt(); // Lee el teclado

		if (num1 >= num2 && num1 >= num3) { // Primera posibilidad si num1 es el mayor
			if (num2 >= num3) { // Ordena num2 y num2
				System.out.println("Orden: " + num1 + ", " + num2 + ", " + num3);
			} else {
				System.out.println("Orden: " + num1 + ", " + num3 + ", " + num2);
			}
		} else if (num2 >= num1 && num2 >= num3) { // Segunda posibilidad si num2 es el mayor
			if (num1 >= num3) { // Ordena num1 y num3
				System.out.println("Orden: " + num2 + ", " + num1 + ", " + num3);
			} else {
				System.out.println("Orden: " + num2 + ", " + num3 + ", " + num1);
			}
		} else { // El mayor es num3
			if (num1 >= num2) { // Ordena num1 y num2
				System.out.println("Orden: " + num3 + ", " + num1 + ", " + num2);
			} else {
				System.out.println("Orden: " + num3 + ", " + num2 + ", " + num1);
			}
		}

		scanner.close(); // Cierra el scanner
	}

}
