package chapters.chapter04;

public class checkpoint05 {

	public static void main(String[] args) {
		//Character class.

		Character ch1;
		char ch2 = 'G';

		System.out.println(Character.isLowerCase(ch2));

		System.out.println("isDigit('a') is " + Character.isDigit('a'));
		System.out.println("isLetter('a') is " + Character.isLetter('a'));
		System.out.println("isLowerCase('a') is " + Character.isLowerCase('a'));
		System.out.println("isUpperCase('a') is " + Character.isUpperCase('a'));
		System.out.println("toLowerCase('T') is " + Character.toLowerCase('T'));
		System.out.println("toUpperCase('q') is " + Character.toUpperCase('q'));

	}

}
