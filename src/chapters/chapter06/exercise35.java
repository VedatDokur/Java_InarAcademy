package chapters.chapter06;

import java.util.Scanner;

public class exercise35 {

	public static void main(String[] args) {
		// Geometry: area of a pentagon.

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the side:");

		double s = input.nextDouble();

		System.out.println("The area of the pentagon is " + area(s));

	}

	public static double area(double side) {

		return 5 * Math.pow(side, 2) / (4 * Math.tan(Math.PI / 5));

	}

}
