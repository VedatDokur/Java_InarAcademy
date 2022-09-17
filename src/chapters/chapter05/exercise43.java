package chapters.chapter05;

public class exercise43 {

	public static void main(String[] args) {
		// Math: combinations.

		int count = 0;
		String c = "";

		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {

				if (j != i && !c.contains(j + " " + i)) {
					count++;
					c = c + "\n" + i + " " + j;
				}

			}

		}
		System.out.println(c);

		System.out.println("Total number for combinations is " + count);
	}

}
