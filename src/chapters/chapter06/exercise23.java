package chapters.chapter06;

import java.util.Scanner;

public class exercise23 {

	public static void main(String[] args) {
		// Occurrences of a specified character.

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a str:");
		String s = input.nextLine();
		System.out.print("Enter a charecter:");
		char ch = input.nextLine().charAt(0);

		System.out.println("the number of " + ch + " in the string is " + count(s, ch));
	}
	public static int count(String str, char a) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == a)
				count++;
		}
		return count;
	}
}
