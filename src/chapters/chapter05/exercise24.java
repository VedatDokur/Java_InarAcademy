package chapters.chapter05;

public class exercise24 {

	public static void main(String[] args) {
		//Sum a series.
		
		double sum = 0;
		for (int i = 1; i <= 99; i++) {
			sum += i / (i + 2.0);
		}
		System.out.println("Sum of the series is: " +sum);
	}

}
