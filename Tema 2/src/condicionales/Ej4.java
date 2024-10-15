package condicionales;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Configuramos el scanner

		// Variables
		int numero;
		String numeroEnLetras = "";

		System.out.println("Introduce un número entre 1 y 99:"); // Pide el numero
		numero = scanner.nextInt(); // Lee el teclado

		if (numero < 1 || numero > 99) { // Comprueba validez
			System.out.println("El número está fuera del rango permitido.");
		} else { // Empieza a calcular el nombre del numero
			if (numero < 10) {
				switch (numero) {
				case 1:
					numeroEnLetras = "uno";
					break;
				case 2:
					numeroEnLetras = "dos";
					break;
				case 3:
					numeroEnLetras = "tres";
					break;
				case 4:
					numeroEnLetras = "cuatro";
					break;
				case 5:
					numeroEnLetras = "cinco";
					break;
				case 6:
					numeroEnLetras = "seis";
					break;
				case 7:
					numeroEnLetras = "siete";
					break;
				case 8:
					numeroEnLetras = "ocho";
					break;
				case 9:
					numeroEnLetras = "nueve";
					break;
				}
			} else if (numero < 20) {
				switch (numero) {
				case 10:
					numeroEnLetras = "diez";
					break;
				case 11:
					numeroEnLetras = "once";
					break;
				case 12:
					numeroEnLetras = "doce";
					break;
				case 13:
					numeroEnLetras = "trece";
					break;
				case 14:
					numeroEnLetras = "catorce";
					break;
				case 15:
					numeroEnLetras = "quince";
					break;
				case 16:
					numeroEnLetras = "dieciséis";
					break;
				case 17:
					numeroEnLetras = "diecisiete";
					break;
				case 18:
					numeroEnLetras = "dieciocho";
					break;
				case 19:
					numeroEnLetras = "diecinueve";
					break;
				}
			} else {
				int unidad = numero % 10;
				int decena = numero / 10;
				String decenaEnLetras = "";

				if (decena == 2 && unidad != 0) {
					switch (unidad) {
					case 1:
						numeroEnLetras = "veintiuno";
						break;
					case 2:
						numeroEnLetras = "veintidós";
						break;
					case 3:
						numeroEnLetras = "veintitrés";
						break;
					case 4:
						numeroEnLetras = "veinticuatro";
						break;
					case 5:
						numeroEnLetras = "veinticinco";
						break;
					case 6:
						numeroEnLetras = "veintiséis";
						break;
					case 7:
						numeroEnLetras = "veintisiete";
						break;
					case 8:
						numeroEnLetras = "veintiocho";
						break;
					case 9:
						numeroEnLetras = "veintinueve";
						break;
					}
				} else {
					switch (decena) {
					case 2:
						decenaEnLetras = "veinte";
						break;
					case 3:
						decenaEnLetras = "treinta";
						break;
					case 4:
						decenaEnLetras = "cuarenta";
						break;
					case 5:
						decenaEnLetras = "cincuenta";
						break;
					case 6:
						decenaEnLetras = "sesenta";
						break;
					case 7:
						decenaEnLetras = "setenta";
						break;
					case 8:
						decenaEnLetras = "ochenta";
						break;
					case 9:
						decenaEnLetras = "noventa";
						break;
					}

					if (unidad == 0) {
						numeroEnLetras = decenaEnLetras;
					} else {
						String unidadEnLetras = "";
						switch (unidad) {
						case 1:
							unidadEnLetras = "uno";
							break;
						case 2:
							unidadEnLetras = "dos";
							break;
						case 3:
							unidadEnLetras = "tres";
							break;
						case 4:
							unidadEnLetras = "cuatro";
							break;
						case 5:
							unidadEnLetras = "cinco";
							break;
						case 6:
							unidadEnLetras = "seis";
							break;
						case 7:
							unidadEnLetras = "siete";
							break;
						case 8:
							unidadEnLetras = "ocho";
							break;
						case 9:
							unidadEnLetras = "nueve";
							break;
						}
						numeroEnLetras = decenaEnLetras + " y " + unidadEnLetras;
					}
				}
			}
			System.out.println("El número " + numero + " en letras es: " + numeroEnLetras);
		}

		scanner.close(); // Cierra el scanner

	}

}
