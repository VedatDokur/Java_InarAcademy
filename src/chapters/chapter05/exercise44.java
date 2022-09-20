package chapters.chapter05;

import java.util.Scanner;

public class exercise44 {

	public static void main(String[] args) {
		// Computer architecture: bit-level operations.

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an int: ");
		short n = input.nextShort();
		String s = "";

		short mask = 0b1; 

		for (int i = 0; i < 16; i++) {

			short bit = (short) (n & mask); 
			// remainder of
			// division by 2
			s = bit + s;
			n = (byte) (n >> 1); 
		}

		System.out.println("The bits are ");
		System.out.println(s);

	}

}
