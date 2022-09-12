package chapters.chapter05;

import java.util.Scanner;


public class checkpoint09 {

	public static void main(String[] args) {
		// SubstractionQuizLoop.
		Scanner keyboard = new Scanner(System.in);
		
		long startTime = System.currentTimeMillis();
		
		String report = " ";
		int counter = 0;
		int trueCounter = 0;
				
		while (counter < 5) {
			int num1 = (int) (Math.random() * 100);
			int num2 = (int) (Math.random() / 3 * 100);

			if (num1 < num2) {
				int temporaryNum = num2;
				num1 = num2;
				num2 = temporaryNum;
			}
			System.out.println(num1 + " - " + num2 + " = ?");
			int answer = keyboard.nextInt();

			if (num1 - num2 == answer) {
				System.out.println("Correct.");
				trueCounter++;
				report += num1 + " - " + num2 + " = " + answer + " true\n" ; 
			} else {
				System.out.println("Answer is false.");
				report += num1 + " - " + num2 + " = " + answer + " false\n" ;
			}
			counter++;
		}
		long endTime = System.currentTimeMillis();
		int time = (int)((endTime - startTime) / 1000);
		System.out.println("Totally time is : " + time +   " seconds. " );
		System.out.println(counter + " asked question: ");
		System.out.println(trueCounter + " totally true answer. ");
		System.out.println(report);
	}

}
