package chapters.chapter07;

import java.util.Scanner;

public class exercise02 {

	public static void main(String[] args) {
		//Reverse the numbers emtered.
		
		Scanner input = new Scanner(System.in);
		int[] sayi = new int[10];
		
		System.out.print("Enter values: ");
		
		for(int i = 0; i < sayi.length; i++) {
			sayi[i] = input.nextInt();
		}

		for(int i = sayi.length -1; i >= 0; i--) {
			System.out.print(sayi[i] + " ");
		}
	}

}
