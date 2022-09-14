package chapters.chapter05;

import java.util.Scanner;

public class exercise02 {

	public static void main(String[] args) {
		//Repeat additions.
		
		final int questions = 10;
		int correctCount = 0;
		int count = 0;
		
		long startTime = System.currentTimeMillis();
		String output = "";
		Scanner input = new Scanner(System.in);
		
		while(count < questions) {
			int num1 = (int)(Math.random() * 16);
			int num2 = (int)(Math.random() * 16);
			
			System.out.println("What is the " + num1 + " + " + num2 + " ? ");
			int answer = input.nextInt();
			
			if(num1 + num2 == answer) {
				System.out.println("Your answer is correct");
				correctCount++;
			}else
				System.out.println("Your answer is false.\n" + num1 + " + " + num2 + " must be " + (num1 + num2));
			count++;
			output += "\n" +num1 + " + " + num2 + " = " + answer + ((num1 + num2 == answer) ? " correct " : " wrong ");
		}
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		System.out.println("Correct count is " +correctCount + "\nTest time is " + testTime / 1000 + " seconds \n" + output);

	}

}
