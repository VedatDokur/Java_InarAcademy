package chapters.chapter05;

import java.util.Scanner;

public class checkpoint07 {

	public static void main(String[] args) {
		// GuessNumberOneTime.

		int number = (int) (Math.random() * 101);

		Scanner keyboard = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter the number between 0 and 100: ");
			int guess = keyboard.nextInt();
			if (number == guess) {
				System.out.println("Correct.");
				System.exit(0);
			}else if(number < guess) {
				System.out.println("Your number is big.");
			}else {
				System.out.println("Your number is small.");
			}
		}
	}
}
