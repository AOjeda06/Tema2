package dowhile;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce un número entero positivo:");
		int N = scanner.nextInt();

		int suma = 0;
		int numero = 1;

		do {
			suma += numero; // Sumar el número actual a la suma total
			numero++; // Incrementar el número
		} while (numero <= N); // Continuar hasta que el número sea N

		System.out.println("La suma de los números desde 1 hasta " + N + " es: " + suma);

		scanner.close(); // Cerramos el scanner
	}

}
