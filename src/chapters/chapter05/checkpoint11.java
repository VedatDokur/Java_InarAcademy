package chapters.chapter05;

import java.util.Scanner;

public class checkpoint11 {

	public static void main(String[] args) {
		//Sentinel Value.
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the plus value, exit is 0. ");
		int num = keyboard.nextInt();
		
		int total = 0;
		while(num != 0) {  //Sentinel degerdir, kodu kirar.
			total += num;
			System.out.println("Enter the plus value, exit is 0.");
			num = keyboard.nextInt();
		}
		System.out.println("Total: " +total);
	}

}
