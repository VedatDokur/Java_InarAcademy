package chapters.chapter02;

import java.util.Scanner;

public class exercise09 {

	public static void main(String[] args) {
		//Physics acceleration.
		
		Scanner input = new Scanner(System.in);
		
		  System.out.print("Enter v0, v1, and t:");
		  double v0 = input.nextDouble();
		  double v1 = input.nextDouble();
		  double t = input.nextDouble();
		  double avg = (v1 - v0) / t;
		 
		  System.out.println("The average acceleration is " + avg);
		 
		 }

}
