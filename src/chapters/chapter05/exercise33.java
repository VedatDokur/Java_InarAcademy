package chapters.chapter05;

public class exercise33 {

	public static void main(String[] args) {
		//Perfect number.
		
		int sumDivisor = 0;
		int numPerfect = 0;
		
		for (int i = 1; i <= 10000; i++) {
			for (int j = 1; j < i; j++) {
				if(i % j == 0) {
					sumDivisor += j;
				}
			}
			if(sumDivisor == i) {
				System.out.println(i + " is a perfect num");
				numPerfect++;
			}
			sumDivisor = 0;
		}
		System.out.println("Total num perfect num are " +numPerfect);

	}

}
