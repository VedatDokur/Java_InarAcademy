package chapters.chapter06;

public class exercise01 {

	public static void main(String[] args) {
		// Math: pentagonal numbers.

		for (int i = 1; i <= 100; i++) {
			System.out.printf("%8d", getPentagonalNumber(i));
			if (i % 10 == 0) {
				System.out.println("");
			}

		}

	}

	public static int getPentagonalNumber(int n) {
		return n * (3 * n - 1) / 2;

	}

}
