package chapters.chapter06;

import java.util.Scanner;

public class exercise21 {

	public static void main(String[] args) {
		// Phoe Keypads.
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a str: ");
		String s = input.nextLine();
		String s2 = "";

		for (int i = 0; i < s.length(); i++) {

			int num = getNum(s.toUpperCase().charAt(i));
			if (num != 0) {
				s2 = s2 + num;
			} else {
				s2 = s2 + s.charAt(i);
			}

		}

		System.out.println(s2);

	}

	static int getNum(char uppercaseLetter) {

		int n;

		switch (uppercaseLetter) {
		case 'A':
		case 'B':
		case 'C':
			n = 2;
			break;

		case 'D':
		case 'E':
		case 'F':
			n = 3;
			break;

		case 'G':
		case 'H':
		case 'I':
			n = 4;
			break;

		case 'J':
		case 'K':
		case 'L':
			n = 5;
			break;

		case 'M':
		case 'N':
		case 'O':
			n = 6;
			break;

		case 'P':
		case 'Q':
		case 'R':
		case 'S':
			n = 7;
			break;

		case 'T':
		case 'U':
		case 'V':
			n = 8;
			break;

		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
			n = 9;
			break;

		default:
			n = 0;
			break;
		}

		return n;

	}

}
