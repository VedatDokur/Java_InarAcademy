package chapters.chapter05;

public class exercise12 {

	public static void main(String[] args) {
		//Find the smallest n such that n2>12,000.
		
		int n = 1;
		while(Math.pow(n, 2) <= 12000) {
			n++;
		}
		System.out.println("The n is " +n);
		System.out.println("The n^2 is " +Math.pow(n, 2));
	}

}
