package chapters.chapter05;

import java.util.Scanner;

public class exercise46 {

	public static void main(String[] args) {
		//Reverse a string.

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string:");
		String s = input.nextLine();
		String s2 = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			s2 += s.charAt(i);

		}

		System.out.println("Reversed string is " + s2);
	}

}
