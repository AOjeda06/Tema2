package foor;

public class Ej4 {

	public static void main(String[] args) {

		// Variables
		int total = 0, contador = 0;

		// Muestra texto por pantalla
		System.out.println("Los 10 primeros números impares son: ");

		// Bucle
		for (int i = 0; contador < 10; i++) {
			if (i % 2 != 0) {
				total += i;
				contador++;
			}
		}

		// Respuesta
		System.out.println("La suma de los 10 primeros numeros impares es: " + total);
	}

}
