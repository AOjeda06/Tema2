package condicionales;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Pedimos la hora, los minutos y los segundos
		System.out.println("Introduce la hora (0-23):");
		int horas = scanner.nextInt();
		System.out.println("Introduce los minutos (0-59):");
		int minutos = scanner.nextInt();
		System.out.println("Introduce los segundos (0-59):");
		int segundos = scanner.nextInt();

		// Incrementamos los segundos
		segundos++;

		// Verificamos si hay desbordamiento de segundos
		if (segundos == 60) {
			segundos = 0;
			minutos++;
		}

		// Verificamos si hay desbordamiento de minutos
		if (minutos == 60) {
			minutos = 0;
			horas++;
		}

		// Verificamos si hay desbordamiento de horas
		if (horas == 24) {
			horas = 0;
		}

		// Mostramos la hora actualizada
		System.out.printf("La hora después de incrementar un segundo es: ", horas, minutos, segundos);

		scanner.close();
	}

}
