package chapters.chapter05;

import java.util.Scanner;

public class exercise30 {

	public static void main(String[] args) {
		//Financial application: compound value.
		
		Scanner input = new Scanner(System.in);
		
		  System.out.print("Enter monthly saving:");
		  double saving = input.nextDouble();
		 
		  System.out.print("Enter annual interest rate:");
		  double interest = input.nextDouble();
		  interest /= 12 * 100;
		 
		  System.out.print("Enter number of months:");
		  double noMonths = input.nextDouble();
		  double TotalSaving = 0;
		 
		  for (int i = 1; i <= noMonths; i++) {
		 
		   TotalSaving = (TotalSaving + saving) * (1 + interest);
		 
		  }
		 
		  System.out.println("Total saving is " + TotalSaving);

	}

}
