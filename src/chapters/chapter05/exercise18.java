package chapters.chapter05;

import java.util.Scanner;

public class exercise18 {

	public static void main(String[] args) {
		//Display four patterns using loops.
		System.out.print("Enter the number of lines:");
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		System.out.println("Pattern A");
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

	


