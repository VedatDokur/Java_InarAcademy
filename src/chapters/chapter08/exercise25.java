package chapters.chapter08;

import java.util.Scanner;

public class exercise25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-3 matrix row by row:");
		double[][] n = new double[3][3];

		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				n[i][j] = input.nextDouble();
			}
		}

		String s = "";
		if (!isMarkovMatrix(n)) {
			s = " not";
		}
		System.out.println("It is" + s + " a Markov matrix");
	}

	public static boolean isMarkovMatrix(double[][] m) {
		for (int i = 0; i < m.length; i++) {
			double sum = 0;
			for (int j = 0; j < m.length; j++) {
				if (m[j][i] < 0) {
					return false;
				}
				sum += m[j][i];
			}
			if (sum != 1.0) {
				return false;
			}
		}

		return true;
	}

}
