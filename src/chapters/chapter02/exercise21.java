package chapters.chapter02;

import java.util.Scanner;

public class exercise21 {

	public static void main(String[] args) {
		//Financial application, calculate future investment value.
		
		Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter investment amount:");
		  
		  double investmentAmount = input.nextDouble();
		  System.out.print("Enter annual interest rate in percentage:");
		  
		  double monthlyInterestRate = input.nextDouble();
		  monthlyInterestRate = monthlyInterestRate / 12;
		  System.out.print("Enter number of years:");
		  
		  double numberOfYears = input.nextDouble();
		  double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate / 100), (numberOfYears * 12));
		  System.out.print("Accumulated value is " + futureInvestmentValue);

	}

}
