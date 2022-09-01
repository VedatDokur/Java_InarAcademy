package chapters.chapter03;

import java.util.Scanner;

public class exercise27 {

	public static void main(String[] args) {
		//Geometry: points in triangle.
		
		Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter a point's x- and y-coordinates:");
		  double x = input.nextDouble();
		  double y = input.nextDouble();
		  double y2 = -x / 2 + 100;
		  String s = " ";
		 
		  // Check if y and x is in range and under the line
		 if(( (y > 0) && (x > 0) && (x + 2*y < 200) )){
		   s = " ";
		  }
		  else
		  {
		    s = " not ";
		  }
		 
		  System.out.print("The point is" + s + "in the triangle");

	}

}
