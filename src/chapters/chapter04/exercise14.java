package chapters.chapter04;

import java.util.Scanner;

public class exercise14 {

	public static void main(String[] args) {
		//Convert letter grade to number.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter grade: ");
		String s = input.nextLine();
		
		if(s.length() != 1) {
			System.out.println("You must enter a one character");
			System.exit(1);
		}
		char ch = s.charAt(0);
		int i = 0;
		switch (ch) {
		case 'A':
			i = 4;
			break;
		case 'B':
			i = 3;
			break;
		case 'C':
			i = 2;
			break;
		case 'D':
			i = 1;
			break;
		case 'F':
			i = 0;
			break;
			
			default:
				System.out.println(s + " is an invalid grade");
				System.exit(1);
				break;
		}
		System.out.println("The numeric value for grade " + s + " is " + i);

	}

}
