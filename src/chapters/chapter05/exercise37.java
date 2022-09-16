package chapters.chapter05;

import java.util.Scanner;

public class exercise37 {

	public static void main(String[] args) {
		//Decimal to binary.
		
		Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter an int:");
		  int dec = input.nextInt();
		  String bin = "";
		 
		  while (dec != 0) {
		   bin = dec % 2 + bin;
		   dec = dec / 2;
		  }
		 
		  System.out.println("The binary form is " + bin);

	}

}
