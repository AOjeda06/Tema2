package condicionales;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Configuramos el scanner.
		int numero; // Variable para el numero introducido
		int valorAbsoluto; // Variable para el valor absoluto

		System.out.println("Introduce un número:"); // Pide el numero
		numero = scanner.nextInt(); // Almacena el valor introducido en la variable

		valorAbsoluto = (numero < 0) ? -numero : numero; // Calcula el valor absoluto

		System.out.println("El valor absoluto de " + numero + " es " + valorAbsoluto); // Da la respuesta

		scanner.close(); // Cierra el scanner
	}

}
