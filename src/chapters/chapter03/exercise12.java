package chapters.chapter03;

import java.util.Scanner;

public class exercise12 {

	public static void main(String[] args) {
		//Palindrome number
		
		System.out.print("Enter a three-digit integer:");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();

		// Extracting digits
		int first = number / 100;
		int last = number % 10;
		if (last == first) {
			System.out.print(number + " is a palindrome");
		} else {
			System.out.print(number + " is not a palindrome");
		}
	}

}
