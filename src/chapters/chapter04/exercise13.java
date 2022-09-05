package chapters.chapter04;

public class exercise13 {

	public static void main(String[] args) {
		// Vowel or consonant?
		/*
		 * Enter a letter : B B is a consonant Enter a letter grade : A A is a vowel
		 * Enter a letter grade : # İs an invalid input
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		String s = input.nextLine();

		// Check your string for the one character.
		if (s.length() != 1) {
			System.out.println("You must enter one character");
			System.exit(1);
		}
		// Check if input is valid
		char ch = Character.toUpperCase(s.charAt(0));
		if (ch > 'Z' || ch < 'A') {
			System.out.println(s + " is an invalid input");
			System.exit(1);
		}
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == '0' | ch == 'U') {
			System.out.println(s + " is a vowel");
			System.exit(1);
		}
		System.out.println(s + " is a consonant");

	}

}
