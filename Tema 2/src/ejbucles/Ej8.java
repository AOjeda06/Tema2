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
			System.out.println("Di un numero: ");
			num = scanner.nextInt();
			if (num == 0) {
				break;
			} else if (num < prevNum) {
				System.out.println("Numero no valido");
				contadorFallos++;
			}
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