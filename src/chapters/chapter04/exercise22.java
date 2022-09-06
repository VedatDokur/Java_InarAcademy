package chapters.chapter04;

import java.util.Scanner;

public class exercise22 {

	public static void main(String[] args) {
		//Check substring.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string s1: ");
		String s1 = input.nextLine();
		System.out.println("Enter a string s2: ");
		String s2 = input.nextLine();
		
		if (s1.contains(s2)) {
			System.out.println(s2 + "is a substring of " +s1);
		}else {
			System.out.println(s2 + "is not a substring of " +s1);
		}

	}

}
