package ejbucles;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Creamos el scanner

		// Variables
		int horas, min, seg;
		int incremento;

		// Pide y guarda los valores
		System.out.println("Introduce las horas: ");
		horas = scanner.nextInt();

		System.out.println("Introduce los minutos: ");
		min = scanner.nextInt();

		System.out.println("Introduce los segundos: ");
		seg = scanner.nextInt();

		System.out.println("Intrduce la cantidad a incrementar en segundos: ");
		incremento = scanner.nextInt();

		// Realiza el incremento
		seg += incremento;

		// Calcula las llevadas
		while (seg >= 60) {
			seg -= 60;
			min++;
		}

		while (min >= 60) {
			min -= 60;
			horas++;
		}

		while (horas >= 24) {
			horas -= 24;
		}

		// Imprime el resultado
		System.out.println("La nueva hora es: " + horas + ":" + min + ":" + seg);

		scanner.close(); // Cerramos el scanner

	}

}
