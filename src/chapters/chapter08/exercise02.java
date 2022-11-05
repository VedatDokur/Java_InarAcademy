package chapters.chapter08;

import java.util.Scanner;

public class exercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[][] matrix = new double[4][4];
		java.util.Scanner input = new Scanner(System.in);
		System.out.println("Enter a 4-4 matrix: ");
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = input.nextDouble();
			}
		}
		System.out.println("Sum of the diagonals are " + sumDiagonal(matrix));
	}

	public static double sumDiagonal(double[][] m) {
		double sum = 0;
		for (int row = 0; row < m.length; row++) {
			sum += m[row][row];
		}
		return sum;
	}

}
