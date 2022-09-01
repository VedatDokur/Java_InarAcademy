package chapters.chapter03;

import java.util.Scanner;

public class exercise31 {

	public static void main(String[] args) {
		// Financials: currency exchange.

		Scanner s = new Scanner(System.in);
		double exchangeRate, dollarAmount, rmbAmount;
		int userChoice;

		System.out.print("Enter the exchange rate from dollars to RMB:");
		exchangeRate = s.nextDouble();

		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa:");
		userChoice = s.nextInt();

		if (userChoice == 0) {
			System.out.print("Enter the dollar amount:");
			dollarAmount = s.nextDouble();

			rmbAmount = dollarAmount * exchangeRate;
			System.out.print("$" + dollarAmount + " is " + rmbAmount + " yuan.");
		} else if (userChoice == 1) {
			System.out.print("Enter the RMB amount:");
			rmbAmount = s.nextDouble();

			dollarAmount = rmbAmount / exchangeRate;
			System.out.print(rmbAmount + " yuan is $" + dollarAmount);
		} else {
			System.out.print("Invalid choice.");
		}
	}
}
