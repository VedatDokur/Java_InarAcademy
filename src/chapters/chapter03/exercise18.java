package chapters.chapter03;

import java.util.Scanner;

public class exercise18 {

	public static void main(String[] args) {
		//Cost of shipping.
		Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter the weight of the package in pound:");
		  double weight = input.nextDouble();
		  double cost = 0;
		 
		  if (weight > 0 && weight <= 1) {
		   cost = 3.5;
		  } else if (weight > 1 && weight <= 3) {
		   cost = 5.5;
		  } else if (weight > 3 && weight <= 10) {
		   cost = 8.5;
		  } else if (weight > 10 && weight <= 20) {
		   cost = 10.5;
		  }
		 
		  if (cost == 0) {
		   System.out.print("the pakage cannot be shipped.");
		   System.exit(0);
		  }
		 
		  System.out.print("The cost of shipping is " + cost);

	}

}
