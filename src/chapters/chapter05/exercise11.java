package chapters.chapter05;

public class exercise11 {

	public static void main(String[] args) {
		//Find numbers divisible by 5 or 6, but not both.
		
		int number = 0;
		for(int i = 100; i <= 200; i++) {
			if(i%5 == 0 || i%6 == 0 && i%5 != 0 || i%6 != 0) {
				System.out.println(i + " ");
				number += 1;
				
				
			}
		}

	}

}
