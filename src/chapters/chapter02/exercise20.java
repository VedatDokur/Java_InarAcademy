package chapters.chapter02;

import java.util.Scanner;

public class exercise20 {

	public static void main(String[] args) {
		//Financial application, calculate interest.
		
		Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter balance and interest rate (e.g., 3 for 3%):");
		  double balance = input.nextDouble();
		  double annualInterestRate = input.nextDouble();
		  double interest = balance * (annualInterestRate/1200);
		  System.out.print("The interest is " + interest);
		 
		 }

}

