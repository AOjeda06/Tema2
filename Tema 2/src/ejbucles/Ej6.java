package ejbucles;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		// Configuramos el scanner
		Scanner scanner = new Scanner(System.in);

		// Variables
		int proporcion;

		// Pide el numero y guarda el valor
		System.out.println("Introduce un numero para las medidas del triangulo");
		proporcion = scanner.nextInt();

		// Bucle
		// Fijamos i en 1, y repetimos hasta que i = numero introducido
		for (int i = 1; i <= proporcion; i++) {
			// Imprimir espacios en blanco antes del primer asterisco para centrar los asteriscos
			for (int j = 1; j <= proporcion - i; j++) {
				System.out.print(" ");
			}
			// Imprimir los asteriscos con un espacio a la derecha para que estén separados el uno del otro
			for (int j = 1; j <= i; j++) {
				System.out.print("* "); 
			}
			// Saltar a la siguiente línea
			System.out.println(); 
		}

		// Cerramos el scanner
		scanner.close();
	}

}