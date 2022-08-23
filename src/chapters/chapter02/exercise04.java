package chapters.chapter02;

import java.util.Scanner;

public class exercise04 {
	public static void main(String[] Strings) {
		
	}
	Scanner input = new Scanner(System.in);
    System.out.print("Enter a number in pounds: ");

    double pounds = input.nextDouble();
    double kilograms = pounds * 0.454;

    System.out.println(pounds + " pounds is " + kilograms + " kilograms.");
}
