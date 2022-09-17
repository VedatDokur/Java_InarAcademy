package chapters.chapter05;

import java.util.Scanner;

public class exercise45 {

	public static void main(String[] args) {
		//Statistics: compute mean and standard deviation

		 Scanner input = new Scanner(System.in);
		  
		  System.out.print("Enter ten numbers:");
		  double sum = 0;
		  double suma = 0;
		 
		  for (int i = 0; i < 10; i++) {
		   double n = input.nextDouble();
		   sum += n;
		   suma += Math.pow(n, 2);
		 
		  }
		 
		  System.out.println("The mean is " + sum / 10);
		  System.out.println("The standard deviation is " + Math.sqrt(((suma - Math.pow(sum, 2) / 10))/9));

	}

}
