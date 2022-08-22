package chapters.chapter02;

import java.util.Scanner;

public class checkpoint03 {
	//Compute Average
	public static void main(String[] args) {
		Scanner Vedat = new Scanner(System.in);
		
		System.out.println("Enter three number to calculate the average: ");
		
		double number1 = Vedat.nextDouble();
		double number2 = Vedat.nextDouble();
		double number3 = Vedat.nextDouble();
		
		double average = (number1 + number2 + number3) /3;
		
		System.out.println("Average of three numbers entered: " +average);
		
	}
}
