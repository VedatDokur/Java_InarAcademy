package chapters.chapter02;

import java.util.Scanner;

public class exercise02 {

	public static void main(String[] args) {
		//Radius length of the cylinder.
		
		Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and the length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = radius * radius * 3.14159265359;
        double volume = area * length;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
	}

}
