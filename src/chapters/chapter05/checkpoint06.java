package chapters.chapter05;

import java.util.Scanner;

public class checkpoint06 {

	public static void main(String[] args) {
		// GuessNumberOneTime.

		int number = (int) (Math.random() * 101);

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the number between 0 and 100");
		int guess = keyboard.nextInt();
		
		while(number != guess) {
			if(number < guess) {
				System.out.println("Your number is big.");
			}else {
				System.out.println("Your number is small.");
			}
			System.out.println("Enter the number between 0 and 100");
			guess = keyboard.nextInt();
		}
			System.out.println("Correct.");
	}

}
