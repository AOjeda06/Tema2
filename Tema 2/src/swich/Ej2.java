package swich;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Creamos el scanner
		int numero; // Creamos la variable para almacenar el numero introducido
		System.out.println("Introduce un número entre 1 y 7:"); // Pide el numero
		numero = scanner.nextInt(); // Lee el teclado

		switch (numero) {
		case 1 -> { // Si es Lunes
			System.out.println("Lunes");
			break;
		}
		case 2 -> { // Si es Martes
			System.out.println("Martes");
			break;
		}
		case 3 -> { // Si es Miercoles
			System.out.println("Miercoles");
			break;
		}
		case 4 -> { // Si es Jueves
			System.out.println("Jueves");
			break;
		}
		case 5 -> { // Si es Viernes
			System.out.println("Vierne");
			break;
		}
		case 6 -> { // Si es Sábado
			System.out.println("Sabado");
			break;
		}
		case 7 -> { // Si es Domingo
			System.out.println("Domingo");
			break;
		}
		}

		scanner.close(); // Cerramos scanner
	}

}
