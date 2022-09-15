package chapters.chapter05;

public class exercise05 {

	public static void main(String[] args) {
		// Conversion from kilograms to pounds and pounds to kilograms.

		final int END = 199;
		final int poundStart = 20;

		System.out.printf("%-8s%10s", "Kilograms", "Pounds");
		System.out.printf("\t|\t");
		System.out.printf("%8s%10s\n", "Pounds", "Kilograms");

		for (int j = 0, i = 1; i <= END; i += 2, j += 5) {
			System.out.printf("%-8d%15.1f", i, i * 2.2);
			System.out.printf("\t|\t");
			System.out.printf("%-8d%10.1f\n", poundStart + j, (poundStart + j) / 2.2);
		}

	}

}
