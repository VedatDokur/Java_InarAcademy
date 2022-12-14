package chapters.chapter08;

import java.util.Scanner;

public class exercise29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b, c, d, e, f below:");
		double[][] a = new double[2][2];
		double[] b = new double[2];
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[i].length; i++)
				a[i][j] = input.nextDouble();

		double[] point = linearEquation(a, b);
		if (linearEquation(a, b) == null) {
			System.out.println("No solution.");
		} else {
			System.out.println("x = " + point[0] + " and y = " + point[1]);
		}

	}

	public static double[] linearEquation(double[][] a, double[] b) {

		double ab_Minus_bc = a[0][0] * a[1][1] - a[0][1] * a[1][0];

		if (ab_Minus_bc == 0.0)
			return null;

		// x = (e * d - b * f) / ab_Minus_bc;
		// y = (a * f - e * c) / ab_Minus_bc;
		double[] point = new double[2];
		point[0] = (b[0] * a[1][1] - b[1] * a[0][1]) / ab_Minus_bc;
		point[1] = (b[1] * a[0][0] - b[0] * a[1][0]) / ab_Minus_bc;

		return point;
	}

}
