package condicionales;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Configuramos el scanner
		
		// Declaramos las variables
		double distancia;
		int diasEstancia;
		double precioPorKilometro;
		double precioBillete;

		// Solicitar distancia a recorrer
		System.out.println("Introduce la distancia a recorrer (en kilómetros):");
		distancia = scanner.nextDouble();

		// Solicitar número de días de estancia
		System.out.println("Introduce el número de días de estancia:");
		diasEstancia = scanner.nextInt();

		// Precio por kilómetro
		precioPorKilometro = 2.5;
		// Precio inicial del billete
		precioBillete = distancia * precioPorKilometro;

		// Aplicar descuento si corresponde
		if (diasEstancia > 7 && distancia > 800) {
			precioBillete = precioBillete * 0.7; // Aplicar 30% de descuento
		}

		// Mostrar el precio final del billete
		System.out.printf("El precio final del billete de tren es: %.2f €%n", precioBillete);

		scanner.close();
	}

}
