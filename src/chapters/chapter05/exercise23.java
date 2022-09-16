package chapters.chapter05;

public class exercise23 {

	public static void main(String[] args) {
		//Demonstrate cancellation errors.
		
		final int n = 50000;
		double sumLR = 0, sumRL = 0;
		
		for (int i = 1; i <= n; i++) {
			sumLR = sumLR + 1.0/i;
			sumRL = sumRL + 1.0/(n-i+1);
			
		}
		System.out.println("Sum from the left to right: " +sumLR);
		System.out.println("Sum from the right to left: " +sumRL);
	}

}
