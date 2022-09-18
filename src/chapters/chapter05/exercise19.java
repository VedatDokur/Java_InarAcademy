package chapters.chapter05;

import java.util.Scanner;

public class exercise19 {

	public static void main(String[] args) {
		// Display numbers in a pyramid pattern.

		System.out.print("Enter the number of lines:");
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= (n - i); j++) {
				System.out.print("    ");
			}

			for (int j = 0; j < i; j++) {
				System.out.printf("%4d", (int) Math.pow(2, j));
			}

			for (int j = i - 2; j >= 0; j--) {
				System.out.printf("%4d", (int) Math.pow(2, j));
			}
			System.out.println();
		}
	}
}
