package chapters.chapter04;

import java.util.Scanner;

public class denemeexercise08 {

	public static void main(String[] args) {
		/*Write a program that receives an ASCII code 
		  (an integer between 0 and 127) and displays its character. 
		  Here is a sample run: Enter an ASCII code: 69
		  The character for ASCII code 69 is E */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an ASCII code: ");
		int s = input.nextInt();
		
		System.out.println("The character for ASCII code " + s + " is " + (char) s);
	}

}
