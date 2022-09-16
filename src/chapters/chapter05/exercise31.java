package chapters.chapter05;

import java.util.Scanner;

public class exercise31 {

	public static void main(String[] args) {
		//Financial application: compute CD value.
		
		Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter the initial deposit amount:");
		  double saving = input.nextDouble();
		 
		  System.out.print("Enter annual percentage yield:");
		  double interest = input.nextDouble();
		  interest /= 12 * 100;
		 
		  System.out.print("Enter maturity period (number of months):");
		  double noMonths = input.nextDouble();
		 
		
		  System.out.printf("%5s%10s\n", "Month", "CD value");
		 
		  for (int i = 1; i <= noMonths; i++) {
		 
		   saving = saving * (1 + interest);
		   System.out.printf("%5d%10.1f\n", i, saving);
		  }
	}
}
	
