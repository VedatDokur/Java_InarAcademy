package chapters.chapter02;

import java.util.Scanner;

public class exercise23 {

	public static void main(String[] args) {
		//Cost of driving.
		
		Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter the driving distance:");
		  double distance = input.nextDouble();
		   System.out.print("Enter miles per gallon:");
		  
		  double fuelEff = input.nextDouble();
		  System.out.print("Enter price per gallon:");
		  
		  double pricePerGallon = input.nextDouble();
		  double cost = distance / 25.5 * pricePerGallon;
		  System.out.print("The cost of driving is $" + cost);

	}

}
