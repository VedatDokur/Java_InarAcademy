package chapters.chapter05;

import java.util.Scanner;

public class exercise14 {

	public static void main(String[] args) {
		//Compute the greatest common divisor.
		
		System.out.println("Enter the 2 ints");
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		if(n2 < n1) {
			int temp = n2;
			n2 = n1;
			n1 = temp;
		}
		for(int d = n1; true;d--) {
			if(n1 % d == 0 && n2 % d == 0) {
				System.out.println("The average is: " +d);
				break;
			}
		}
	}

}
