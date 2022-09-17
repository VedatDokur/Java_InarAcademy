package chapters.chapter05;

import java.util.Scanner;

public class exercise39 {

	public static void main(String[] args) {
		//Financial application: find the sales amount.
		
		Scanner input = new Scanner(System.in);
		  System.out.print("Enter commission amount:");
		  double commSought = input.nextDouble();
		  double sale;
		 
		  if (commSought <= 400) {
		   sale = commSought / 0.08;
		 
		  } else if (commSought <= 900) {
		   sale = (commSought - 400) / 0.1 + 5000;
		  } else {
		   sale = (commSought - 900) / 0.12 + 10000;
		  }
		 
		  System.out.println("You need to generate is " + sale);
	}

}
