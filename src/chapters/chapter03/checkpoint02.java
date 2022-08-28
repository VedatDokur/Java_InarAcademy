package chapters.chapter03;

import java.util.Scanner;

public class checkpoint02 {

	public static void main(String[] args) {
		//Random process.
		int num1 = (int)(Math.random() * 10);
		int num2 = (int)(Math.random() * 10);
		
		System.out.println(num1 + " + " + num2 + " = ? ");
		Scanner keyboard = new Scanner(System.in);
		int total = keyboard.nextInt();
		
		if(num1 + num2 == total) {
			System.out.println("Answer is true");
		}else {
			System.out.println("Answer is false");
		}
	}

}
