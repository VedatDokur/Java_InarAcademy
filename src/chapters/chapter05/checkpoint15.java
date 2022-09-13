package chapters.chapter05;

public class checkpoint15 {

	public static void main(String[] args) {
		//Multiplication Table.
		
		System.out.println("\t\t\t\tCarpim Tablosu");
		for(int i = 1; i < 10; i++) {
			System.out.print("\t" +i);
		}
		System.out.println("\n--------------------------------------------------------------------------------");
		for(int i = 1; i < 10; i++) {
			System.out.print(i + " | ");
			for(int j =1; j < 10; j++) {
				System.out.printf("\t%2d", i * j);				
			}
			System.out.println();
		}
	}

}
