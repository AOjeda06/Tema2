package if_else;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Configuramos el scanner
		double numero; // Creamos la variable decimal
		System.out.print("Introduce un número decimal: "); // Pide el numero
		numero = scanner.nextDouble(); // Lee el numero por teclado

		if (numero > -1 && numero < 1 && numero != 0) { // Creamos el condicional que compara el valor introducido
			System.out.println("El número " + numero + " es un número casi-cero.");
		} else { // La alternativa si devuelve false
			System.out.println("El número " + numero + " no es un número casi-cero.");
		}

		scanner.close(); // Cerramos el sacnner
	}

}
