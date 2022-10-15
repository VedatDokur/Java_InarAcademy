package chapters.chapter07;

import java.util.Scanner;

public class exercise01 {

	public static void main(String[] args) {
		// Assign grades.

		System.out.println("Enter a num for students: ");
		Scanner input = new Scanner(System.in);

		int deger = input.nextInt();
		int[] skor = new int[deger];
		int enYüksekSkor = 0;

		System.out.println("Enter " + deger + " score: ");

		for (int i = 0; i <= skor.length; i++) {
			skor[i] = input.nextInt();
			if (enYüksekSkor < skor[i]) {
				enYüksekSkor = skor[i];
			}
		}
		char derece;
		for (int i = 0; i < skor.length; i++) {
			if (skor[i] >= enYüksekSkor - 10)
				derece = 'A';
			else if (skor[i] >= enYüksekSkor - 20)
				derece = 'B';
			else if (skor[i] >= enYüksekSkor - 30)
				derece = 'C';
			else if (skor[i] >= enYüksekSkor - 40)
				derece = 'D';
			else
				derece = 'F';

			System.out.println("Student " + i + " score is " + skor[i] + " and grade is " + derece);
		}
	}
}
