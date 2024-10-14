package condicionales;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Configuramos el scanner
		int numero; // Variable para el numero introducido
		int unidad; // Variable para la parte de las unidades del numero
		int decena; // Variale para la parte de las decenas del numero
		String numeroEnLetras; // Variable para la respuesta final

		// Variables para las palabras posibles para transcribir los numeros
		String[] unidades = { "", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve" };
		String[] decenas = { "", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta",
				"noventa" };
		String[] especiales = { "diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete",
				"dieciocho", "diecinueve" };

		System.out.println("Introduce un número entre 1 y 99:"); // Pide un numero
		numero = scanner.nextInt(); // Lee el teclado

		if (numero < 1 || numero > 99) { // Comprueba la validez
			System.out.println("El número está fuera del rango permitido.");
		} else {

			if (numero < 10) { // Calcula la longitud del numero y en consecuencia que palabras usar
				numeroEnLetras = unidades[numero];
			} else if (numero < 20) {
				numeroEnLetras = especiales[numero - 10];
			} else {
				unidad = numero % 10;
				decena = numero / 10;
				numeroEnLetras = decenas[decena] + (unidad != 0 ? " y " + unidades[unidad] : "");
			}
			// Devuelve la respuesta
			System.out.println("El número " + numero + " en letras es: " + numeroEnLetras);
		}

		scanner.close(); // Cierra el scanner

	}

}
