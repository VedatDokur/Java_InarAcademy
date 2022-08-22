package chapters.chapter02;

import java.util.Scanner;

public class checkpoint01 {
	//Enter a number
	public static void main(String [] args) {
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Enter a number: ");
		int number = keyboard.nextInt();
		
		System.out.println("Entered Number: "+number);
		
	}
}
