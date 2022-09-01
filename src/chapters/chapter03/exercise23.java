package chapters.chapter03;

import java.util.Scanner;

public class exercise23 {

	public static void main(String[] args) {
		//Geometry: point in a rectangle.
		
		Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter a point with two coordinates:");
		  double x = input.nextDouble();
		  double y = input.nextDouble();
		 
		  String s = " ";
		 
		  if (Math.abs(x) > 5 || Math.abs(y) > 2.5) {
		   s = " not ";
		  }
		 
		  System.out.print("Point (" + x + ", " + y + ") is" + s + "in the rectangle");
	}

}
