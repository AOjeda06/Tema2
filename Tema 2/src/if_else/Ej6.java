package if_else;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Configuramos el scanner

		double a, b, c; // Declaramos las variables para los coeficientes
		double discriminante; // Discriminante (b2-4ac)
		double x1, x2, x; // Posibles soluciones

		// Pedir los coeficientes al usuario
		System.out.print("Introduce el coeficiente a: ");
		a = scanner.nextDouble(); // Lee el valor para a
		System.out.print("Introduce el coeficiente b: ");
		b = scanner.nextDouble(); // Lee el valor para b
		System.out.print("Introduce el coeficiente c: ");
		c = scanner.nextDouble(); // Lee el valor para c

		// Calcular el discriminante
		discriminante = b * b - 4 * a * c;

		// Comprobar los valores de a y b
		if (a == 0) {
			if (b != 0) {
				x = (-c) / b;
				System.out.println("La solución es: x = " + x);
			} else {
				System.out.println("No hay solución, ya que a y b son 0.");
			}
		} else if (discriminante > 0) { // Evaluar las soluciones según el valor del discriminante
			// Dos soluciones reales
			x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
			x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
			System.out.println("Las soluciones son: x1 = " + x1 + " y x2 = " + x2);
		} else if (discriminante == 0) {
			// Una solución real
			x = -b / (2 * a);
			System.out.println("La solución es: x = " + x);
		} else {
			// No hay soluciones reales
			System.out.println("No hay soluciones reales.");
		}

		scanner.close(); // Cerramos el scanner
	}

}
