package chapters.chapter04;

public class checkpoint03 {

	public static void main(String[] args) {
		//Character data types.
		char ch = 'A';
		int i = ch;
		ch++;
		System.out.println(i);
		System.out.println(ch++);

		char ch2 = '4';
		System.out.println(ch2);
		System.out.println((int) ch2);

		char ch3 = 0x0041;
		System.out.println(ch3);

	}

}
