package chapters.chapter04;

import java.util.Scanner;

public class exercise21 {

	public static void main(String[] args) {
		//Check SSN.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a SSN: ");
		String s = input.nextLine();
		
		for(int i = 0; i < s.length(); i++) {
			if ((i == 3 || i == 6 ) && s.charAt(i) == '-') {
				continue;
			}
			if (!Character.isDigit(s.charAt(i))) {
				System.out.println(s + " is an invalid SSN ");
				System.exit(0);
			}
		}
		System.out.println(s + " is a valid SSN");
	}

}
