package chapters.chapter06;

import java.util.Scanner;

public class exercise04 {

	public static void main(String[] args) {
		//Display an integer reversed.
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a int: ");
		int num = input.nextInt();
		
		System.out.println("The num is " +reverse(num));

	}
		public static int reverse(int num) {
			int reverse = 0;
			int digit;
			
			do {
				digit = num %10;
				reverse = reverse * 10 + digit;
				num /= 10;
			}while (num != 0);
			
			return reverse;
		}

}
