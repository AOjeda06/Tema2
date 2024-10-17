package english;

import java.util.Random;
import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// Set random and scanner
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int targetNumber = random.nextInt(100) + 1; // Generate a number between 1 and 100
        int guess = 0;

        System.out.println("Guess a number between 1 and 100 (enter a negative number to give up):");

        while (true) {
            guess = scanner.nextInt();

            if (guess < 0) {
                System.out.println("You've decided to give up. The number was " + targetNumber);
                break; // Exit the loop if the user gives up
            }

            if (guess < targetNumber) {
                System.out.println("Higher!");
            } else if (guess > targetNumber) {
                System.out.println("Lower!");
            } else {
                System.out.println("Congratulations! You guessed the number.");
                break; // Exit the loop if the user guesses correctly
            }
        }
        
        // Close scanner
		scanner.close();

        		
	}

}
