package chapters.chapter05;

import java.util.Scanner;

public class checkpoint08 {

	public static void main(String[] args) {
		// GuessNumberOneTime.

		int number = (int) (Math.random() * 101);

		Scanner keyboard = new Scanner(System.in);

		int guess = -1;
		while (number != guess) {
			System.out.println("Enter the number between 0 and 100");
			guess = keyboard.nextInt();

			if (number == guess) {
				System.out.println("Correct.");
			} else if (number < guess) {
				System.out.println("Your number is high.");
			} else {
				System.out.println("Your number is low.");
			}
		}

	}

}
