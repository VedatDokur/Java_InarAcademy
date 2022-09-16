package chapters.chapter05;

public class exercise13 {

	public static void main(String[] args) {
		//Find the largest n such that n3<12,000.
		
		int i = 1;
		while(Math.pow(i, 3) <= 12000) {
			i++;
		}
			i--;
		System.out.println("The n is " +i);
		System.out.println("The n^3 is " +Math.pow(i, 3));
	}

}
