package chapters.chapter06;

import java.util.Scanner;

public class exercise37 {

	public static void main(String[] args) {
		// Format an integer.
		//TEKRAR.

		System.out.print("Enter an interger:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.print("Enter the width:");
		int width = input.nextInt();
		System.out.println(format(num, width));

	}

	public static String format(int num, int width) {
		int numOfDigit = getSize(num);
		String format = String.valueOf(num);

		for (int i = 0; i < width - numOfDigit; i++) {
			format = "0" + format;
		}

		return format;
	}

	
	public static int getSize(long d) {

		int numOfDigit = 1;
		while ((d = d / 10) != 0) {
			numOfDigit++;
		}
		return numOfDigit;

	}

}
