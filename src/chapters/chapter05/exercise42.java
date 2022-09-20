package chapters.chapter05;

import java.util.Scanner;

public class exercise42 {

	public static void main(String[] args) {
		// Financial application: find the sales amount.

		Scanner input = new Scanner(System.in);
		System.out.print("Enter commission amount:");
		double commissionSought = input.nextDouble();
		double sale = 0, commission = 0;

		while (commission < commissionSought) {

			if (sale <= 5000) {
				commission = sale * 0.08;

			} else if (sale <= 10000) {
				commission = 5000 * .08 + (sale - 5000) * 0.1;

			} else {

				commission = 5000 * .08 + 5000 * 0.1 + (sale - 10000) * .12;
			}

			sale += 0.01; // increase sale by a penny on each loop
		}
		System.out.printf("The sale you need to generate is %.2f", (sale - 0.01));
	}

}
