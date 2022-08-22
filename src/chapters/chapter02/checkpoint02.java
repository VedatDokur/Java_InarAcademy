package chapters.chapter02;

import java.util.Scanner;

public class checkpoint02 {
	//Reading Input from the Console
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double radius;
		double area;
		System.out.println("Enter a number for radius: ");
		
		//Radius
		radius = input.nextDouble();
		
		//Area
		area = radius * radius * 3.14159;
		
		//Result
		System.out.println("The are for the circle of radius "+ radius + " is " +area);
		
				
		
	}
	
}
