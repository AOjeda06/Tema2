package foor;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Creamos el scanner

		// Variables
		int num1;
		int num2;

		// Pide y guarda los numeros
		System.out.println("Escriba el primer numero: ");
		num1 = scanner.nextInt();

		System.out.println("Escriba el segundo numero: ");
		num2 = scanner.nextInt();

		if (num1 != num2) {
			if (num1 < num2) {
				for (int i = num1; i <= num2; i++) {
					System.out.println(i);
				}
			} else {
				for (int i = num2; i <= num1; i++) {
					System.out.println(i);
				}
			}
		} else {
			System.out.println("Los numeros son iguales");
		}

		scanner.close(); // Cerramos el scanner
	}

}
