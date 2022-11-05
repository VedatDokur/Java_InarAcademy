package chapters.chapter08;

import java.util.Scanner;

public class exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double [][] matrix = new double[3][4];
		
		java.util.Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-4 matrix: ");
		for(int row = 0; row < matrix.length; row++) {
			for(int column =0; column < matrix[row].length; column++) {
				matrix[row][column] = input.nextDouble();
			}
		}
		
		for(int column =0; column <matrix[0].length; column++){
				System.out.println("Sum of the column " +column + " is " +sumColumn(matrix, column));
		}
	}
	public static double sumColumn(double[][ ] m, int columnIndex) {
		double sum = 0;
		for(int row = 0; row < m.length; row++) {
			sum += m[row][columnIndex];
		}
		return sum;
	}
	