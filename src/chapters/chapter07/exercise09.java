package chapters.chapter07;

import java.util.Scanner;

public class exercise09 {

	public static void main(String[] args) {
		//Find the smallest element.
		
		System.out.println("Enter ten nums: ");
		Scanner input = new Scanner(System.in);
		double[]numbers = new double[10];
		
		for(int i =0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
		System.out.println("Min number is: " +min(numbers));
	}
		
		public static double min(double[]array) {
			double min = array[0];
			for(int i = 1; i < array.length; i++) {
				if(min > array[i]) {
					min = array[i];
				}
			}
			return min;
		}
}
