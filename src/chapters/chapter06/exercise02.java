package chapters.chapter06;

import java.util.Scanner;

public class exercise02 {

	public static void main(String[] args) {
		// Sum the digits in an integer.

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer:");
		long n = input.nextLong();

		System.out.println("The sum is " + sumDigits(n));
	}

	public static int sumDigits(long n) {

		int sum = 0;
		do {
			sum += n % 10;

		} while ((n = n / 10) != 0);

		return sum;
	}

}
