package chapters.chapter02;

import java.util.Scanner;

public class checkpoint06 {
 public static void main(String[] args) {
	 //Fixed area calculation
	 final double PI = 3.14159;
	 
	 Scanner input = new Scanner(System.in);
	 double radius;
	 double area;
	 
	 System.out.println("Enter a radius for area:");
	 radius = input.nextDouble();
	 
	 
	 area = radius*radius* PI;
	 //Result
	 System.out.println("radius " +radius +" the area of circle: "+area);
	 
 }
}
