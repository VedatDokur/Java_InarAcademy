package chapters.chapter05;

import java.util.Scanner;

public class checkpoint03 {

	public static void main(String[] args) {
		//RepeatAdditionQuiz.
		
		int num1 = (int)(Math.random() * 10);
		int num2 = (int)(Math.random() * 10);
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println(num1 + " + " + num2 + " = ? ");
		int answer = keyboard.nextInt();
						
		while(num1 + num2 != answer) {
			System.out.println("Answer is false.");
			answer = keyboard.nextInt();
		}
		System.out.println("Correct. ");

	}

}
