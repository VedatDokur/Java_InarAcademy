package chapters.chapter05;

public class exercise04 {

	public static void main(String[] args) {
		//Conversion from miles to kilometers.
		
		final int END = 10;
		System.out.printf("%-8s%10s\n", "Miles","Kilometers");
		
		for(int i = 1; i <= END; i++) {
			System.out.printf("%-8d%10.1f\n", i, i * 1.609);
		}

	}

}
