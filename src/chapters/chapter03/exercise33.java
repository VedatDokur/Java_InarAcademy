package chapters.chapter03;

import java.util.Scanner;

public class exercise33 {

	public static void main(String[] args) {
		//Financial: compare costs.

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter weight and price for package 1:");
		double weight1 = input.nextDouble();
		double price1 = input.nextDouble();
		System.out.println("Enter weight and price for package 2:");
		double weight2 = input.nextDouble();
		double price2 = input.nextDouble();
		double r = weight2 / price2 - weight1 / price1;
		String s = "";

		if (r < 0.0000001) { // comparing double to zero is not reliable, using
			// minimum threshold instead
			System.out.println("Two packages have the same price.");
			System.exit(0);
		}

		if (r > 0) {
			s = "Pakage 2";
		} else {
			s = "Pakage 1";
		}

		System.out.println(s + " has better price.");
	}

}
