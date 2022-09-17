package chapters.chapter05;

import java.util.Scanner;

public class exercise48 {

	public static void main(String[] args) {
		// Process string.

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string:");
		String s = input.nextLine();

		for (int i = 0; i < s.length(); i++) {
			if ((i + 1) % 2 == 1) {
				System.out.print(s.charAt(i));
			}
		}
	}
}
