package chapters.chapter06;

public class exercise29 {

	public static void main(String[] args) {
		// Twin primes.

		for (int i = 2; i < 1000; i++) {

			if (isPrime(i) && isPrime(i + 2)) {
				System.out.printf("(%d, %d)\n", i, i + 2);
			}
		}

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
