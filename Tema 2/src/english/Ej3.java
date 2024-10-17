package english;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// Set up the scanner
        Scanner scanner = new Scanner(System.in);

        // Variables
        int maxHeight = 0; // Initializing to zero to handle comparisons properly
        int height;
        int minHeight = Integer.MAX_VALUE; // Using max value to ensure it gets replaced by any input height

        // Ask the user for heights until a 0 is entered
        while (true) {
            System.out.println("Enter the height of a student in cm (enter a 0 to finish):");
            height = scanner.nextInt();

            if (height == 0) {
                break; // Exit the loop if the user enters 0
            }

            if (height > maxHeight) {
                maxHeight = height;
            }
            if (height < minHeight) {
                minHeight = height;
            }
        }

        // Response
        System.out.println("Max height: " + maxHeight + " cm");
        System.out.println("Min height: " + (minHeight == Integer.MAX_VALUE ? 0 : minHeight) + " cm");

        // Close the scanner
		scanner.close();
	}

}
