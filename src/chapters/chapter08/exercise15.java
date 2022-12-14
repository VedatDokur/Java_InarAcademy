package chapters.chapter08;

import java.util.Scanner;

public class exercise15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter five points:");

		double[][] points = new double[5][2];

		for (int i = 0; i < points.length; i++) {
			points[i][0] = input.nextDouble();
			points[i][1] = input.nextDouble();
		}

		if (sameLine(points)) {
			System.out.println("five points are on the same line");
		} else {
			System.out.println("five points are not on the same line");
		}

	}

	public static boolean sameLine(double[][] points) {

		double x0 = points[0][0];
		double y0 = points[0][1];
		double x1 = points[1][0];
		double y1 = points[1][0];

		for (int i = 2; i < points.length; i++) {
			double c = (x1 - x0) * (points[i][1] - y0) - (points[i][0] - x0) * (y1 - y0);
			if (c != 0) {
				return false;
			}
		}

		return true;
	}

}
