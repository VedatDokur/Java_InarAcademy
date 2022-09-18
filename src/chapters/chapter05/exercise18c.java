package chapters.chapter05;

public class exercise18c {

	public static void main(String[] args) {
		//Display four patterns using loops.
		
		for(int i = 1; i <= 6; i++) {
			for(int s = 6 - i; s >= 1; s--) {
				System.out.print("  ");
			}
			for(int n = i; n >= 1; n--) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}

}
