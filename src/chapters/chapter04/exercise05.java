package chapters.chapter04;

import java.util.Scanner;

public class exercise05 {

	public static void main(String[] args) {
		//Geometry: area of a regular polygon.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the num for sides: ");
		double n = input.nextDouble();
		
		System.out.println("Enter the side: ");
		double s = input.nextDouble();
		
		double area = n * Math.pow(s, 2) / (4 * Math.tan(Math.PI / n));
		System.out.println("The area of the polygon is " +area);

	}

}
