package chapters.chapter02;

import java.util.Scanner;

public class exercise05 {
	public static void main(String[] Strings) {
		
		//Financial Application
	
		
        double gratuityRate,
                gratuityTotal,
                total,
                subtotal;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the subtotal and gratuity rate: ");
        subtotal = input.nextDouble();
        gratuityRate = input.nextDouble();

        gratuityTotal = subtotal * gratuityRate * .01;
        total = subtotal + gratuityTotal;

        System.out.print("The gratuity is $" + gratuityTotal + " and total is $" + total);
	}
}