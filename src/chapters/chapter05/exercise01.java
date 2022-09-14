package chapters.chapter05;

import java.util.Scanner;

public class exercise01 {

	public static void main(String[] args) {
		//Count positive and negative numbers and compute the average of numbers.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a integer value, input ends if it's 0");
		
		int n, countNegative = 0, countPositive = 0;
		float sum = 0;
		
		while((n = input.nextInt()) != 0) {
			sum = sum +n ;
			if(n > 0) {
				countPositive++;
			}else if (n < 0) {
				countNegative++;
			}
		}
		
		if (countPositive + countNegative == 0) {
			System.out.println("No numbers are entered without 0");
			System.exit(0);
		}
		System.out.println("The number of positives is " +countPositive);
		System.out.println("The number of negatives is " +countNegative);
		System.out.println("The total is " +sum);
		System.out.println("The average is " + (sum / (countPositive + countNegative)));
	}

}
