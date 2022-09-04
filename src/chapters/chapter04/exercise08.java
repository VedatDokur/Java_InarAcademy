package chapters.chapter04;

import java.util.Scanner;

public class exercise08 {

	public static void main(String[] args) {
		//Find the character of an ASCII code.
		
		Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter an ASCII code:");
		  int s = input.nextInt();
		 
		  System.out.print("The character for ASCII code " + s + " is " + (char) s);

	}

}
