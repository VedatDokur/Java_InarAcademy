package chapters.chapter05;

public class exercise40 {

	public static void main(String[] args) {
		//Simulation: heads or tails.

		int k = 0;
		int l = 0;
		int m = 0;

		for (int i = 0; i < 1e6; i++) {
			k = (int) (Math.random() * 2);

			if (k == 1) {
				l++;
			} else {
				m++;
			}

		}

		System.out.println("The number of heads is " + l);
		System.out.println("The number of tails is " + m);
	}

}
