package chapters.chapter07;

import java.util.Scanner;

public class exercise33 {

	public static void main(String[] args) {
		// Culture: Chinese Zodiac.

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a year: ");
		int year = input.nextInt();
		int index = (year % 12);
		String[] zodiac = { "monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake",
				"horse", "sheep", };
		System.out.println(zodiac[index]);
	}

}
