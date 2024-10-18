package dowhile;

public class Ej2 {

	public static void main(String[] args) {

		int numero = 2; // Inicializar el número en el primer número par

		do {
			System.out.println(numero); // Mostrar el número actual
			numero += 2; // Incrementar el número en 2 para obtener el siguiente número par
		} while (numero <= 200); // Condicion del bucle
	}

}
