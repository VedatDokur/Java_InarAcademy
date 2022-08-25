package chapters.chapter02;

import java.util.Scanner;

public class exercise14 {

	public static void main(String[] args) {
		//Health application, computing BMI.
		
		Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter weight in pounds:");
		  double weight = input.nextDouble();
		  System.out.print("Enter height in inches:");
		  double height = input.nextDouble();
		  double BMI = (weight * 0.45359237) / Math.pow(height * 0.0254, 2);
		 
		  System.out.print("BMI is " + BMI);
		 
		 }
}


