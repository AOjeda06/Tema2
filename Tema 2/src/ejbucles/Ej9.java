package ejbucles;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		// Configuramos el scanner
		Scanner scanner = new Scanner(System.in);

		// Variables
		int num;
		String numero;
		int numChars;
		
		// Pide y guarda el numero
		System.out.println("Escribe un numero: ");
		num = scanner.nextInt();
		
		//Transforma el int a string y el numero de chars del string a un int
		numero = Integer.toString(num);
		
		numChars = numero.length();
		
		// Respuesta
		System.out.println("El numero introducido tiene "+numChars+ " cifras.");
		
		// Cerramos el scanner
		scanner.close();
	}

}
