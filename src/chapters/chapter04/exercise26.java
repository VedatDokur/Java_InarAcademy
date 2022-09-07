package chapters.chapter04;

import java.util.Scanner;

public class exercise26 {

	public static void main(String[] args) {
		//Financial application: monetary units.
		
		 // Create a Scanner
	    Scanner input = new Scanner(System.in);
	 
	    // Receive the amount 
	    System.out.print("Enter an amount in double, for example 11.56: ");
	    String amount = input.next();
	    int numberOfOneDollars = Integer.parseInt(amount.substring(0, amount.indexOf('.')));
	    int numberOfCents = Integer.parseInt(amount.substring( amount.indexOf('.')+1));
	 
	 
	 
	    // Find the number of quarters in the remaining amount
	    int numberOfQuarters = numberOfCents / 25;
	    numberOfCents = numberOfCents % 25;
	 
	    // Find the number of dimes in the remaining amount
	    int numberOfDimes = numberOfCents / 10;
	    numberOfCents = numberOfCents % 10;
	 
	    // Find the number of nickels in the remaining amount
	    int numberOfNickels = numberOfCents / 5;
	    numberOfCents = numberOfCents % 5;
	 
	    // Find the number of pennies in the remaining amount
	    int numberOfPennies = numberOfCents;
	 
	    // Display results
	    System.out.println("Your amount " + amount + " consists of"); 
	    System.out.println("    " + numberOfOneDollars + " dollars");
	    System.out.println("    " + numberOfQuarters + " quarters ");
	    System.out.println("    " + numberOfDimes + " dimes"); 
	    System.out.println("    " + numberOfNickels + " nickels");
	    System.out.println("    " + numberOfPennies + " pennies");

	}

}
