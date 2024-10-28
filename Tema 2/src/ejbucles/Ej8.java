package ejbucles;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		// Configuramos el scanner
		Scanner scanner = new Scanner(System.in);

		// Variables
		int num;
		int contador = 0;
		int contadorFallos = 0;
		int prevNum = 0;

		// Bucle
		while (true) {
			// Empieza a pedir numeros
			System.out.println("Di un numero: ");
			num = scanner.nextInt();
			// Si escribe 0 para el programa
			if (num == 0) {
				break;
			// Compara el numero introducido con el último y ve si es un fallo o no
			} else if (num < prevNum) {
				System.out.println("Numero no valido");
				contadorFallos++;
			}
			// Cuenta el total de numeros introducidos y guarda el valor de numero para el siguiente bucle
			contador++;
			prevNum = num;

		}

		// Resultado final
		System.out.println("El numero de numeros introducidos ha sido: " + contador + "; y el número de fallos: "
				+ contadorFallos);

		// Cerramos el scanner
		scanner.close();
	}

}