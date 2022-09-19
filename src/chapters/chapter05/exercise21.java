package chapters.chapter05;

import java.util.Scanner;

public class exercise21 {

	public static void main(String[] args) {
		//Financial application: compare loans with various interest rates.
				

		Scanner input = new Scanner(System.in);
		 
		  // Enter loan amount
		  System.out.print("Enter loan amount:");
		  double loanAmount = input.nextDouble();
		 
		  // Enter number of years
		  System.out.print("Enter number of years: ");
		  int numberOfYears = input.nextInt();
		 
		  // Enter yearly interest rate start value
		  double annualInterestRate = 5.0;
		 
		  // Printing table header
		  System.out.printf("%-18s%-18s%-18s\n", "Interest Rate", "Monthly Payment", "Total Payment");
		 
		  while (annualInterestRate <= 8.0) {
		   // Obtain monthly interest rate
		   double monthlyInterestRate = annualInterestRate / 1200;
		 
		   // Calculate payment
		   double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		   double totalPayment = monthlyPayment * numberOfYears * 12;
		 
		   // Display results
		   System.out.printf("%-18.3f%-18.2f%-18.2f\n", annualInterestRate, monthlyPayment, totalPayment);
		 
		   annualInterestRate = annualInterestRate + 1.0 / 8;
		  }
	}
}

	


