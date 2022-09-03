package chapters.chapter04;

import java.util.Scanner;

public class exercise04 {

	public static void main(String[] args) {
		//Geometry: area of a hexagon.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the side: ");
		
		double s = input.nextDouble();
		double area = 6 * Math.pow(s, 2) / (4 * Math.tan(Math.PI / 6));
		
		area = Math.round(area * 100) / 100.0;
		System.out.println("The are of the hexagon is " + area);
	}

}
