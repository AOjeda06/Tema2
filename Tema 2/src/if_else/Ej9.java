package if_else;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Creamos el scanner

		final String PIEDRA = "PIEDRA"; // Declaramos la constante piedra
		final String PAPEL = "PAPEL"; // Declaramos la constante papel
		final String TIJERA = "TIJERA"; // Declaramos la constante tijera
		String respuesta1; // Declaramos la variable para la respuesta del jugador 1
		String respuesta2; // Declaramos la variable para guardar la respuesta del jugador 2

		System.out.println("jugador 1 escriba su respuesta: ");
		respuesta1 = scanner.nextLine();

		System.out.println("jugador 2 escriba su respuesta: ");
		respuesta2 = scanner.nextLine();

		if (respuesta1.equals(TIJERA) && respuesta2.equals(TIJERA)) {
			System.out.println("Empate");
		} else if (respuesta1.equals(TIJERA) && respuesta2.equals(PAPEL)) {
			System.out.println("Jugador 1 gana");
		} else if (respuesta1.equals(TIJERA) && respuesta2.equals(PIEDRA)) {
			System.out.println("Jugador 2 gana");
		} else if (respuesta1.equals(PAPEL) && respuesta2.equals(PAPEL)) {
			System.out.println("Empate");
		} else if (respuesta1.equals(PAPEL) && respuesta2.equals(TIJERA)) {
			System.out.println("Juagdor 2 gana");
		} else if (respuesta1.equals(PAPEL) && respuesta2.equals(PIEDRA)) {
			System.out.println("Jugador 1 gana");
		} else if (respuesta1.equals(PIEDRA) && respuesta2.equals(PIEDRA)) {
			System.out.println("Empate");
		} else if (respuesta1.equals(PIEDRA) && respuesta2.equals(TIJERA)) {
			System.out.println("Juagor 1 gana");
		} else {
			System.out.println("Jugador 2 gana");
		}
		scanner.close(); // Cerramos el scanner
	}

}
