package chapters.chapter03;

import java.util.Scanner;

public class exercise08 {

	public static void main(String[] args) {
		//Sort three integers
		Scanner input = new Scanner(System.in);

		System.out.print("Enter three integers:");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		int temp = 0;

		if (number1 > number2) {
			temp = number1;
			number1 = number2;
			number2 = temp;
		}

		if (number2 > number3) {
			temp = number2;
			number2 = number3;
			number3 = temp;
		}

		if (number1 > number2) {
			temp = number1;
			number1 = number2;
			number2 = temp;
		}

		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
	}

}
