package chapters.chapter05;

import java.util.Scanner;

public class exercise32 {

	public static void main(String[] args) {
		//Game: Lottery.
		
		Scanner input = new Scanner(System.in);
		
		  System.out.print("Enter 2-Digits: ");
		  int guess = input.nextInt();
		  int lotDigit1;
		  int lotDigit2;
		  int lottery;
		  do {
		   
		   lottery = (int) (Math.random() * 100);
		   
		   lotDigit1 = lottery / 10;
		   lotDigit2 = lottery % 10;
		  } while (lotDigit1 == lotDigit2);
		 
		  
		  int guessDigit1 = guess / 10;
		  int guessDigit2 = guess % 10;
		 
		  System.out.println("The lottery number is " + lottery);
		 
		  
		  if (guess == lottery)
		   System.out.println("You Win: $10,000");
		  else if (guessDigit2 == lotDigit1 && guessDigit1 == lotDigit2)
		   System.out.println("You Win: $3,000");
		  else if (guessDigit1 == lotDigit1 || guessDigit1 == lotDigit2
		    || guessDigit2 == lotDigit1 || guessDigit2 == lotDigit2)
		   System.out.println("You Win: $1,000");
		  else
		   System.out.println("You lose mate :) ");

	}

}
