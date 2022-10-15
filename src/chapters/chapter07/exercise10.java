package chapters.chapter07;

import java.util.Scanner;

public class exercise10 {

	public static void main(String[] args) {
		//Find the index of the smallest element.
		
		System.out.println("Enter ten numbers: ");
		Scanner input = new Scanner(System.in);
		double[]numbers = new double[10];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers [i] = input.nextDouble();
		}
		
		System.out.println("The index of min number is : " +indexOfSmallestElement(numbers));
	}
		public static int indexOfSmallestElement(double[] array) {
			double min = array[0];
			int minIndex = 0;
			
			for(int i = 1; i < array.length; i++) {
				if(min > array[i]) {
					minIndex = i;
				}
			}
				return minIndex;
		}
		
}
