package chapters.chapter04;

import java.util.Scanner;

public class denemeexercise01 {

	public static void main(String[] args) {
		/*rite a program that prompts the user to enter the length from the 
		center of a pentagon to a vertex and computes the area of the pentagon,
		as shown in the following figure. The formula for computing the area of a 
		pentagon isArea=5s24tan(π5), where s is the length of a side.
		The side can be computed using the formula s=2rsinπ5
		where r is the length from the center of a pentagon to a vertex.
		Round up two digits after the decimal point. Here is a sample run:
		Enter the length from the center to a vertex: 5.5
		The area of the pentagon is 71.9  */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter athe length from the center to a vertex");
		
		double r = input.nextDouble();
		double s = 2 * r * Math.sin(Math.PI / 5);
		Double area = 5 * Math.pow(s, 2) / (4 * Math.tan(Math.PI / 5));
		
		area = Math.round(area * 100) / 100.0;
		System.out.println("The are of the pentagon is " + area);

	}

}
