package swich;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Creamos el scanner
		int numero; // Creamos la variable para almacenar el numero introducido
		System.out.println("Introduce un número entre 0 y 10:"); // Pide el numero
		numero = scanner.nextInt(); // Lee el teclado

		switch (numero) {
		case 0, 1, 2, 3, 4 -> { // Si está suspenso
			System.out.println("Suspenso");
			break;
		}
		case 5 -> { // Si está suficiente
			System.out.println("Suficiente");
			break;
		}
		case 6 -> { // Si está bien
			System.out.println("Bien");
			break;
		}
		case 7, 8 -> { // Si está Notable
			System.out.println("Notable");
			break;
		}
		case 9, 10 -> { // Si está Sobresaliente
			System.out.println("Sobresaliente");
			break;
		}
		}

		scanner.close(); // Cerramos scanner
	}

}
