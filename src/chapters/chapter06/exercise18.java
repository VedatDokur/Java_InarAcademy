package chapters.chapter06;

import java.util.Scanner;

public class exercise18 {

	public static void main(String[] args) {
		// Password.

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a pass");
		String p = input.nextLine();

		if (checkp(p)) {
			System.out.println("Valid Pass.");
		} else {
			System.out.println("Invalid Pass.");
		}

	}

	public static boolean checkp(String pass) {
		boolean checkp = true;

		if (pass.length() < 8) {
			checkp = false;
		} else {
			int numOfDigit = 0;
			for (int i = 0; i < pass.length(); i++) {
				if (isDigit(pass.charAt(i)) || isLetter(pass.charAt(i))) {
					if (isDigit(pass.charAt(i))) {
						numOfDigit++;
					}
				} else {
					checkp = false;
					break;
				}
			}
			if (numOfDigit < 2) {
				checkp = false;
			}
		}
		return checkp;
	}

	public static boolean isLetter(char ch) {
		return ((ch <= 'z' && ch >= 'a' || (ch <= 'Z' && ch >= 'A')));
	}

	public static boolean isDigit(char ch) {
		return (ch <= '9' && ch >= '0');
	}
}
