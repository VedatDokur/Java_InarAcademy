package chapters.chapter05;

import java.util.Scanner;

public class exercise18d {

	public static void main(String[] args) {
		//Display four patterns using loops.

		System.out.print("Enter the number of lines:");
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		System.out.println("Pattern C");
		for (int i = 0; i < n; i++) {

			for (int j = i; j > 0; j--) {
				System.out.print("  ");
			}

			for (int j = 1; j <= n - i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
