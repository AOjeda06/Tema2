package dowhile;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Creamos el scanner

		final String PIEDRA = "PIEDRA"; // Declaramos la constante piedra
		final String PAPEL = "PAPEL"; // Declaramos la constante papel
		final String TIJERA = "TIJERA"; // Declaramos la constante tijera
		String respuesta1; // Declaramos la variable para la respuesta del jugador 1
		String respuesta2; // Declaramos la variable para guardar la respuesta del jugador 2
		boolean play = true; // Declaramos la variable para elegir seguir o parar de jugar
		String ans; // Declaramos la variable para la respuesta S/N

		do {
			System.out.println("PIEDRA, PAPEL o TIJERAS?");

			// Pide y comprueba la respuesta del jugador1
			do {
				System.out.println("jugador 1 escriba su respuesta: ");
				respuesta1 = scanner.nextLine();
			} while (!respuesta1.equals(TIJERA) && !respuesta1.equals(PAPEL) && !respuesta1.equals(PIEDRA));

			// Pide y comprueba la respuesta del jugador2
			do {
				System.out.println("jugador 2 escriba su respuesta: ");
				respuesta2 = scanner.nextLine();
			} while (!respuesta2.equals(TIJERA) && !respuesta2.equals(PAPEL) && !respuesta2.equals(PIEDRA));

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
				System.out.println("Jugador 1 gana");
			} else {
				System.out.println("Jugador 2 gana");
			}

			// Pregunta si quiere volver a jugar
			System.out.println("Quieres jugar de nuevo? Escibe 'S' para sí y 'N' para no");
			ans = scanner.nextLine();
			if (ans == "S") {
				play = true;
			} else {
				play = false;
			}

			// Repite el juego o para
		} while (play);

		System.out.println("Fin del juego");

		scanner.close(); // Cerramos el scanner
	}

}
