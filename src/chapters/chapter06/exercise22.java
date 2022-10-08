package chapters.chapter06;

import java.util.Scanner;

public class exercise22 {

	public static void main(String[] args) {
		//Math: approximate the square root.
		
		  System.out.print("Enter a number:");
		  Scanner input = new Scanner(System.in);
		  long n = input.nextLong();
		  System.out.println("\nThe square root of " + n + " is " + sqrt(n));
		 
		 }
		 
		 public static double sqrt(long n) {
		  double lastGuess = 1, nextGuess = 1;
		  int numOfGuess = 0;
		 
		  do {
		   lastGuess = nextGuess;
		   nextGuess = (lastGuess + (n / lastGuess)) / 2;
		   numOfGuess++;
		   System.out.println("Guess " + numOfGuess + " is " + nextGuess);
		  } while (Math.abs(lastGuess - nextGuess) > 0.0001);
		 
		  return nextGuess;
	}

}
