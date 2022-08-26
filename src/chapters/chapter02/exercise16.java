package chapters.chapter02;

import java.util.Scanner;

public class exercise16 {

	public static void main(String[] args) {
		//Geometry, area of a hexagon.
		
		Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter the side:");
		  double s = input.nextDouble();
		  double area = (3 * Math.sqrt(3) / 2) * Math.pow(s, 2);
		  System.out.print("The area of the hexagon is " + area);
		 
		 }

}


