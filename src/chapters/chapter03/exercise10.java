package chapters.chapter03;

import java.util.Scanner;

public class exercise10 {

	public static void main(String[] args) {
		//Game, addition quiz.
		
		Scanner input = new Scanner(System.in);
		
		int number1 =(int) (Math.random() * 90 + 10);
		int number2 =(int) (Math.random() * 90 + 10);
		
		System.out.println("What is " + number1 + " + " + number2 );
		
		System.out.println("Answer is: ");
		int answer = input.nextInt();
		
		if(answer == number1 + number2) {
			System.out.println("Answer is True. ");
		}else {
			System.out.println("Answer is False. ");
		}
	}

}
