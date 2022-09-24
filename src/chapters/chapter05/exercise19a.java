package chapters.chapter05;

import java.util.Scanner;

public class exercise19a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbers of the lines");
		int line = input.nextInt();
		
		for(int i = 1; i <= line; i++) {
			for(int k = (line); k >= i; k--) {
				System.out.print("    ");
			}
			for(int k = 0; k < i; k++ ) {
				System.out.printf("%4d", (int)Math.pow(2, k));
			}
			for(int k = i - 2; k >= 0; k--) {
				System.out.printf("%4d", (int)Math.pow(2, k));
			}
			System.out.println();
		}
	}
}

