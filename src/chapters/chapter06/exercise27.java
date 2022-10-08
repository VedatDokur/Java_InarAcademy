package chapters.chapter06;

public class exercise27 {

	public static void main(String[] args) {
		// Emirp.
		//TEKRAR.

		final int NUMBER_OF_EMIRPS = 100;
		int numberPrinted = 0, testedNumber = 2;

		while (numberPrinted < NUMBER_OF_EMIRPS) {

			if (isPrime(testedNumber) && isPrime(reverse(testedNumber)) && !isPalindrome(testedNumber)) {
				numberPrinted++;
				System.out.print(testedNumber + " ");

				if (numberPrinted % 10 == 0) {
					System.out.println();
				}
			}
			testedNumber++;
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

	public static boolean isPalindrome(int num) {

		return (num == reverse(num));

	}

	public static int reverse(int num) {
		int reverse = 0;
		int digit;

		do {
			digit = num % 10;
			reverse = reverse * 10 + digit;
			num /= 10;
		} while (num != 0);

		return reverse;

	}

}
