package chapters.chapter04;

import java.util.Scanner;

public class checkpoint17 {

	public static void main(String[] args) {
		// HexToDec

		Scanner keyboard = new Scanner(System.in);
		String input = keyboard.next();

		if (input.length() != 1) {
			System.err.println("One character should be entered!");
			System.exit(0);
		}
		char ch = input.toLowerCase().charAt(0);
		int num = 0;

		if ('a' <= ch && ch <= 'f') {
			num = ch - 'a' + 10;
		} else if ('0' <= ch && ch <= '9') {
			num = ch - '0';
		} else {
			System.err.println("Wrong Input");
			System.exit(0);
		}
		System.out.println("Hex " + ch + " is: " + num);
	}
}
