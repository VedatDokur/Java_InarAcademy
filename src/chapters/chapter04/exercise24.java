package chapters.chapter04;

import java.util.Scanner;

public class exercise24 {

	public static void main(String[] args) {
		// Order three cities.

		/*
		 * Enter the first city: Berlin Enter the second city: Stuttgart Enter the third
		 * city: Aachen The three cities in alphabetical order are Aachen Berlin
		 * Stuttgart
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first city:");
		String first = input.nextLine();
		System.out.print("Enter the second city:");
		String second = input.nextLine();
		System.out.print("Enter the third city:");
		String third = input.nextLine();
		String temp = "";

		if (first.compareTo(second) > 0) {
			temp = second;
			second = first;
			first = temp;

		}
		if (second.compareTo(third) > 0) {
			temp = third;
			third = second;
			second = temp;

		}
		if (first.compareTo(second) > 0) {
			temp = second;
			second = first;
			first = temp;

		}
		System.out.println("The three cities in alphabetical order are " + first + " " + second + " " + third);

	}

}
