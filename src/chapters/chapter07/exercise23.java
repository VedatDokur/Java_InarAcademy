package chapters.chapter07;

public class exercise23 {

	public static void main(String[] args) {
		// Game: locker puzzle.

		boolean[] locker = new boolean[100];
		int j = 0;
		for (int i = 0; i < locker.length; i++) {
			j = i;
			while (j < locker.length) {
				locker[j] = !locker[j];
				j = j + i + 1;
			}

		}

		System.out.println("The lockers are open :");
		for (int i = 0; i < locker.length; i++)
			if (locker[i] == true) {
				System.out.print(i + " ");
			}
	}

}
