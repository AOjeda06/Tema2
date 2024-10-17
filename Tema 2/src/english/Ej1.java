package english;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// Set up the scanner
		Scanner scanner = new Scanner(System.in);

		// Variables
		int number;

		// Start asking for numbers
		System.out.println("Enter a positive integer (or a negative number to finish):");
		number = scanner.nextInt();

		// Ask the user for numbers until a negative number is entered
		while (number >= 0) {
			if (number % 2 == 0) {
				System.out.println(number + " is even");
			} else {
				System.out.println(number + " is odd");
			}

			// Ask for the next number
			System.out.println("Enter a positive integer (or a negative number to finish):");
			number = scanner.nextInt();
		}

		System.out.println("End of program.");

		// Close the scanner
		scanner.close();
	}

}
