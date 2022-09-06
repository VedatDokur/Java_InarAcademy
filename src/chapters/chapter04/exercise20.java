package chapters.chapter04;

import java.util.Scanner;

public class exercise20 {

	public static void main(String[] args) {
		//Process a string.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter some string values: ");
		String s = input.nextLine();
		System.out.println("The string length is " + s.length());
		System.out.println("The first character is " +s.charAt(0));

	}

}
