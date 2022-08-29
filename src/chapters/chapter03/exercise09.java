package chapters.chapter03;

import java.util.*;

public class exercise09 {

	public static void main(String[] args) {
		//(Business: check ISBN_10) An ISBN-10 -international standard book number- consist of 10 Digits.
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your ISBN Number: ");

		int isbn_9 = input.nextInt();
		int d9 = isbn_9 % 10;
		int remaining = isbn_9 / 10;
		int d8 = remaining % 10;
		remaining = remaining / 10;
		int d7 = remaining % 10;
		remaining = remaining / 10;
		int d6 = remaining % 10;
		remaining = remaining / 10;
		int d5 = remaining % 10;
		remaining = remaining / 10;
		int d4 = remaining % 10;
		remaining = remaining / 10;
		int d3 = remaining % 10;
		remaining = remaining / 10;
		int d2 = remaining % 10;
		remaining = remaining / 10;
		int d1 = remaining % 10;

		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		if (d10 == 10) {
			System.out.println("Your ISBN Number is " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7
					+ "" + d8 + "" + d9 + "" + "X");

		} else {
			System.out.println("Your ISBN Number is " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7
					+ "" + d8 + "" + d9 + "" + d10);
		}
	}
}
