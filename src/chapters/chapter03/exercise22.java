package chapters.chapter03;

import java.util.Scanner;

public class exercise22 {

	public static void main(String[] args) {
		//Geometry: point in a circle.
		
		 Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter a point with two coordinates:");
		  double x = input.nextDouble();
		  double y = input.nextDouble();
		 
		  double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		  String s = " ";
		 
		  if (d >= 10) {
		   s = " not ";
		  }
		 
		  System.out.print("Point " + x + ", " + y + " is" + s + "in the circle");
	}

}
