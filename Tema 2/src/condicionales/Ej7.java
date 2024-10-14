package condicionales;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Solicitar distancia a recorrer
		System.out.println("Introduce la distancia a recorrer (en kilómetros):");
		double distancia = scanner.nextDouble();

		// Solicitar número de días de estancia
		System.out.println("Introduce el número de días de estancia:");
		int diasEstancia = scanner.nextInt();

		// Precio por kilómetro
		double precioPorKilometro = 2.5;
		// Precio inicial del billete
		double precioBillete = distancia * precioPorKilometro;

		// Aplicar descuento si corresponde
		if (diasEstancia > 7 && distancia > 800) {
			precioBillete = precioBillete * 0.7; // Aplicar 30% de descuento
		}

		// Mostrar el precio final del billete
		System.out.printf("El precio final del billete de tren es: %.2f €%n", precioBillete);

		scanner.close();
	}

}
