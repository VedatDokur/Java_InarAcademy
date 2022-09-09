package chapters.chapter04;

import java.util.Scanner;

public class denemeexercise04 {

	public static void main(String[] args) {
		/* The area of a hexagon can be computed using the following formula 
		(s is the length of a side):Area=6s24tan(π6)
		Write a program that prompts the user to enter the side of a 
		hexagon and displays its area. 
		The area of a hexagon can be computed using the following formula 
		(s is the length of a side):Area=6s24tan(π6)Write a program that prompts the user to enter the side of a hexagon and displays its area.
		Here is a sample run: Enter the side: 5.5
		The area of the hexagon is 78.59 */

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the side: ");
		
		double s = input.nextDouble();
		double area = 6 * Math.pow(s, 2) / (4 * Math.tan(Math.PI / 6));
		
		area = Math.round(area * 100) / 100.0;
		System.out.println("The are of the hexagon is " + area);

	}

}
