package chapters.chapter06;

import java.util.Scanner;

public class exercise05 {

	public static void main(String[] args) {
		//Sort three numbers.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a three nums: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		
		displaySortedNums(num1, num2, num3);

	}
		public static void displaySortedNums(double num1, double num2, double num3) {
			if (num3 > num2) {
				double temp = num2;
				num2 = num3;
				num3 = temp;
			}
			if (num2 > num1) {
				double temp = num1;
				num1 = num2;
				num2 = temp;
				
			}
			if (num3 > num2) {
				double temp = num2;
				num2 = num3;
				num3 = temp;
			}
			System.out.println("The nums are " + num3 + " " + num2 + " " + num1);
		}

}
