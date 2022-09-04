package chapters.chapter04;

import java.util.Scanner;

public class exercise09 {

	public static void main(String[] args) {
		//Find the Unicode of a character.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a character");
		String s = input.nextLine();
		char ch = s.charAt(0);
		
		System.out.println("The Unicode for the character " + ch + " is " + (int) ch);

	}

}
