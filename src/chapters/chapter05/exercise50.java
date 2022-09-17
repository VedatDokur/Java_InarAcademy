package chapters.chapter05;

import java.util.Scanner;

public class exercise50 {

	public static void main(String[] args) {
		// Count uppercase letters.

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string:");
		String s = input.nextLine();
		int numUp = 0;

		for (int i = s.length() - 1; i >= 0; i--) {
			if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
				numUp++;
			}
		}

		System.out.println("The number of uppercase letters is " + numUp);
	}

}
