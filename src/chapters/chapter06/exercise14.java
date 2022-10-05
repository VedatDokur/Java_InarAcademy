package chapters.chapter06;

public class exercise14 {

	public static void main(String[] args) {
		// Estimate PI.

		System.out.printf("%-10s%-10s\n", "i", "m(i)");
		System.out.println(String.format("%20s", "").replace(' ', '-'));
		for (int i = 1; i <= 901; i += 100) {
			System.out.printf("%-10d%-10.4f\n", i, computePi(i));
		}

	}

	public static double computePi(int n) {
		double pi = 0;

		for (int i = 1; i <= n; i++) {
			pi += Math.pow(-1, i + 1) / (2 * i - 1);
		}

		return 4 * pi;

	}

}
