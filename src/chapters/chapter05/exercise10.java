package chapters.chapter05;

public class exercise10 {

	public static void main(String[] args) {
		//Find numbers divisible by 5 and 6.
		
		int number = 0;
		for(int i = 100; i <= 1000; i++) {
			System.out.println(i + " ");
			number += 1;
			
			if(number == 10) {
				System.out.println("\n");
				number = 0;
			}
		}

	}

}
