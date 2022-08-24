package chapters.chapter02;

import java.util.Scanner;

public class checkpoint15 {
	public static void main(String[] args) {
        //Sales Tax

        Scanner input = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is " + (int)(tax*100)/100.0);

    }

}

