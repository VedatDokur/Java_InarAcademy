package chapters.chapter02;

import java.util.Scanner;

public class exercise03 {

	public static void main(String[] args) {
		// 
		Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();
        double meters = feet * 0.305;
        System.out.println(feet + " feet is " + meters + " meters");

	}

}
