package chapters.chapter05;

import java.util.Scanner;

public class checkpoint04 {

	public static void main(String[] args) {
		// RepeatAdditionQuiz.

		int num1 = (int) (Math.random() * 10);
		int num2 = (int) (Math.random() * 10);

		Scanner keyboard = new Scanner(System.in);
		System.out.println(num1 + " + " + num2 + " = ? ");
		int answer = keyboard.nextInt();

		int falseSayaci = 0;
		while (num1 + num2 != answer && falseSayaci < 3) {
			falseSayaci++;
			System.out.println("Answer is false, again.");
			answer = keyboard.nextInt();
		}
		if (num1 + num2 == answer) {
			System.out.println("Correct. ");
		} else {
			System.out.println("You don't have extra limit. ");
		}
	}
}
