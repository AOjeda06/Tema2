package foor;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Creamos el scanner

		// Declaramos variables
		int num;
		boolean primo = true;

		// Pide el numero y guarda la respuesta
		System.out.println("Dime un numero distinto a 0 o 1: ");
		num = scanner.nextInt();

		if(num==0 || num ==1) {
			System.out.println("0 y 1 no son opciones válidas");
			
		}else {for (int i = 2; i <= num; i++) {
			if (i != num){
				if (num % i == 0) {
					System.out.println(num + " no es primo.");
					primo=false;
					break;
				}
			}

		}}
		if (primo == true)
			System.out.println(num + " es primo.");
		scanner.close(); // Cerramos el scanner
	}

}
