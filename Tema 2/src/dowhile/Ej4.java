package dowhile;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce un número entero para ver su tabla de multiplicar:");
		int numero = scanner.nextInt();

		int i = 1; // Inicializar el contador

		do {
			System.out.println(numero + " x " + i + " = " + (numero * i)); // Mostrar la multiplicación
			i++; // Incrementar el contador
		} while (i <= 10); // Continuar hasta el 10
		
		scanner.close(); // Cerramos el scanner
	}

}
