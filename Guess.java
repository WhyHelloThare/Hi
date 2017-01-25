
// Group 15

import java.util.Random;
import java.util.Scanner;

public class Guess{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		Random generator = new Random();
		
		int randomNumber = generator.nextInt(10);
		boolean a_digit = false;
		
		// Loops until the correct number is guessed.
		while (!a_digit){
			
			// Prompts user to enter a number.
			System.out.println("\n" + randomNumber);
			System.out.println("I am thinking of a number from 0 to 9.");
			System.out.print("What is your guess? ");
			String guess = keyboard.next();
			
			// Checks for restrictions and handles invalid inputs.
			if (guess.length() == 1){
				char guesss = guess.charAt(0);
				int ascii = (int) guesss;
				if ((ascii >= 48) && (ascii <= 57)){
					
					int num = Integer.parseInt(guess);
					
					// Shows result of input.
					if (num > randomNumber){
						System.out.println("Your guess is too high.");
					}else if (num < randomNumber){
						System.out.println("You guess is too low.");
					}else {
						System.out.println("You guessed the correct number! :D");
					}
					a_digit = true;
					
				}else{
					System.out.println("Your input that you have entered is invalid. Enter a number from 0 to 9.");
				}
				
			}else{
				System.out.println("Your input that you have entered is invalid. Enter a number from 0 to 9.");
			}
		}
	}
}
