package chapters.chapter12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner input = new Scanner(System.in);
	        System.out.print("Enter two integers: ");
	        int num1 = 0;
	        int num2 = 0;
	        boolean isValid = false;
	        while (!isValid) {
	            try {
	                num1 = input.nextInt();
	                num2 = input.nextInt();
	                isValid = true;
	            } catch (InputMismatchException ex) {

	                input.nextLine();
	                System.out.println("Invalid input..." );
	                System.out.print("Enter two integers: ");
	            }
	        }
	        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	    }
}
