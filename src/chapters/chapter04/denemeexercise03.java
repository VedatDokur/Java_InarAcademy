package chapters.chapter04;

public class denemeexercise03 {

	public static void main(String[] args) {
		/* Find the GPS locations for Atlanta, Georgia; Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina 
		 * from www.gps-data-team.com/map/ and compute the estimated area enclosed by these four cities. 
		 * (Hint: Use the formula in Programming Exercise  4.2 to compute the distance between two cities. 
		 * Divide the polygon into two triangles and use the formula in 
		 * Programming Exercise  2.19 to compute the area of a triangle.)  */

		double x1 = 51.5138505182;
		double y1 = -0.15690922737098845;
		double x2 = 28.5383355;
		double y2 = -81.37923649999999;
		double x3 = 32.0835407;
		double y3 = -81.09983419999998;
		double x4 = 35.2270869;
		double y4 = -80.84312669999997;

		// Calculating 1st triangle; p1, p2 and, p3.
		double side1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		double side2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

		// Calculating 2nd triangle; p1, p3 and, p4.
		side1 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		side2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
		side3 = Math.sqrt(Math.pow(x1 - x4, 2) + Math.pow(y1 - y4, 2));
		s = (side1 + side2 + side3) / 2;
		area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)) + area;

		System.out.println("The area enclosed by 4 cities is " + area + "km^2");

	}

}
