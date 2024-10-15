package whilee;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		// Configuramos el scaner
		Scanner scanner = new Scanner(System.in);

		// Variables
		int sumaEdades = 0;
		int contadorAlumnos = 0;
		int mayoresDeEdad = 0;
		int edad;
		double mediaEdades;

		// Pedir al usuario edades hasta que introduzca un número negativo
		while (true) {
			System.out.println("Introduce la edad de un alumno (introduce un número negativo para terminar):");
			edad = scanner.nextInt();

			if (edad < 0) {
				break; // Salir del bucle si la edad es negativa
			}

			sumaEdades += edad; // Sumar la edad a la suma total
			contadorAlumnos++; // Incrementar el contador de alumnos
			if (edad >= 18) {
				mayoresDeEdad++; // Incrementar el contador de mayores de edad
			}
		}

		// Calcular la media de las edades
		mediaEdades = (contadorAlumnos > 0) ? (double) sumaEdades / contadorAlumnos : 0;

		// Mostrar los resultados
		System.out.println("La suma de todas las edades introducidas es: " + sumaEdades);
		System.out.println("La media de las edades es: " + mediaEdades);
		System.out.println("El número de alumnos es: " + contadorAlumnos);
		System.out.println("El número de alumnos mayores de edad es: " + mayoresDeEdad);

		// Cerramos el scanner
		scanner.close();
	}

}
