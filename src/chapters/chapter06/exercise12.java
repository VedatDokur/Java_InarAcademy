package chapters.chapter06;

public class exercise12 {

	public static void main(String[] args) {
		// Display characters.

		printChars('1', 'Z', 10);
	}

	public static void printChars(char ch1, char ch2, int numPerLine) {
		int numOfPrinted = 0;

		for (; ch1 <= ch2; ch1++) {
			System.out.println(ch1 + " ");
			numOfPrinted++;
			if (numOfPrinted % numPerLine == 0) {
				System.out.println();
			}
		}
	}
}
