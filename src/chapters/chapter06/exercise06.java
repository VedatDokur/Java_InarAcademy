package chapters.chapter06;

import java.util.Scanner;

public class exercise06 {

	public static void main(String[] args) {
		//Display patterns.
		
		System.out.println("Enter a nums for lines: ");
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		displayPattern(n);
	}
		public static void displayPattern(int n) {
			for (int i =1; i <=n; i++) {
				for(int j =1; j <= (n-i); j++) {
					
					int numOfDigit =0;
					int remainder = n - (j-1);
					while(remainder != 0) {
						numOfDigit++;
						remainder /=10;
					}
					for( int k = -1; k < numOfDigit; k++) {
						System.out.print(" ");
					}
				}
				for (int j =i; j > 1; j--) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
		}

}
