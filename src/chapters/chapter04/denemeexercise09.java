package chapters.chapter04;

import java.util.Scanner;

public class denemeexercise09 {

	public static void main(String[] args) {
		/* Write a program that receives a character and displays its Unicode. 
		 * Here is a sample run: Enter a character: E
 		 * The Unicode for the character E is 69 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character");
		String s = input.nextLine();
		char ch = s.charAt(0);
		
		System.out.println("The unicode for the character " + ch + " is " + (int) ch);
	}

}
