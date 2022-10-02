package chapters.chapter06;

public class exercise10 {

	public static void main(String[] args) {
		// Use the isPrime Method.

		int primeNumber = 0;
		for (int i = 0; i < 10000; i++) {

			if (isPrime(i + 1)) {
				System.out.print((i + 1) + " ");
				primeNumber++;
				if (primeNumber % 10 == 0) {
					System.out.println();
				}
			}

		}

		System.out.println("The prime number is: " + primeNumber);

	}
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) { 
				return false; 
			}
		}

		return true; // number is prime

	}

}
