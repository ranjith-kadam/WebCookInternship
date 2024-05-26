package internshipTask;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		//Setting Boundaries
		System.out.println("Enter the lower Boundary ");
		int lb = sc.nextInt();
		System.out.println("Enter the Higher Boundary ");
		int hb = sc.nextInt();

		//Selecting the random number 
		int target = r.nextInt(hb - lb + 1 ) + lb;

		//Number of Attempts 
		System.out.println("Enter the Number Of Attempts ");
		int maxAttempts = sc.nextInt();

		int attempts = 0;
		boolean hasCorrectGuess = false;

		//Start guessing by user
		while(attempts < maxAttempts) {
			System.out.print("\nGuess the number : ");
			int userGuess = sc.nextInt();
			attempts++;

			if(userGuess < target) {
				System.out.println("Guessed number too Small..");
			}
			else if (userGuess > target) {
				System.out.println("Guessed number too High..");
			}
			else {
				System.out.println("Greate, You Guessed correct number !!");
				hasCorrectGuess = true;
				break;
			}

		}
      //Display performance
		if(!hasCorrectGuess) {
			System.out.println("Sorry, you're used all attempts, the correct number is "+target);
		}
		else {
			System.out.println("You're guessed the number in "+attempts +" attempts");
		}
		
		sc.close();
	}
}
