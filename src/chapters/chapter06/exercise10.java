package chapters.chapter06;

public class exercise10 {

	public static void main(String[] args) {
		// Use the isPrime Method.

		int primeNum = 0;
		for (int i = 0; i < 10000; i++) {

			if (isPrime(i + 1)) {
				System.out.print((i + 1) + " ");
				primeNum++;
				if (primeNum % 10 == 0) {
					System.out.println();
				}
			}

		}

		System.out.println("The prime number is: " + primeNum);

	}
	public static boolean isPrime(int num) {
		for (int divisor = 2; divisor <= num / 2; divisor++) {
			if (num % divisor == 0) { 
				return false; 
			}
		}

		return true;

	}

}
