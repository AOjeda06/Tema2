package condicionales;

import java.util.Scanner;

public class Ej8 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Configuramos el scanner

		// Variables
		int mes, año, dias;

		// Solicitar el número del mes
		System.out.println("Introduce el número del mes (1-12):");
		mes = scanner.nextInt();

		// Solicitar el año
		System.out.println("Introduce el año:");
		año = scanner.nextInt();

		dias = 0;

		// Calcular días del mes
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			dias = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			dias = 30;
			break;
		case 2:
			// Verificar si el año es bisiesto
			boolean esBisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
			dias = esBisiesto ? 29 : 28;
			break;
		default:
			System.out.println("Mes no válido.");
			scanner.close();
			return;
		}
		scanner.close();

		System.out.printf("El mes");
	}
}
