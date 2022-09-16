package chapters.chapter05;

public class exercise15 {

	public static void main(String[] args) {
		//Display the ASCII character table.
		
		for(char i = '!'; i <= '~'; i++) {
			System.out.print(i + " ");
			if((i-32)%10 == 0) {
				System.out.println("");
			}
		}

	}

}
