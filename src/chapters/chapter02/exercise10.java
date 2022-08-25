package chapters.chapter02;

import java.util.Scanner;

public class exercise10 {

	public static void main(String[] args) {
		//Science calculating energy.
		
		Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter the amount of water in kilograms:");
		  double M = input.nextDouble();
		  System.out.print("Enter the initial temperature:");
		  double initialTemperature = input.nextDouble();
		  System.out.print("Enter the final temperature:");
		  double finalTemperature = input.nextDouble();
		 
		  double Q = M * (finalTemperature - initialTemperature) * 4184;
		  System.out.print("The energy needed is " + Q);
		 
		 }

}

