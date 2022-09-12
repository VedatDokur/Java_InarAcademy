package chapters.chapter05;

public class checkpoint01 {

	public static void main(String[] args) {
		//LoopExample01.
		int a = 0;
		for(int i = 0; i < Integer.MAX_VALUE; i++) {
			a++;
		}
		System.out.println(a);
		
		int count = 0;
		while (count < 100) {
			System.out.println("Welcome to Java!");
			count++;
		}
	}
}
