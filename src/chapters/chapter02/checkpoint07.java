package chapters.chapter02;

import java.util.Scanner;

public class checkpoint07 {
	//Display Time
	public static void main(String[] args) {
		System.out.println("Enter a integer for the second: ");
		
		Scanner keyboard = new Scanner(System.in);
		
		int second = keyboard.nextInt();
		int minute = second / 60;
		int remainingSecond = second %60;
		
		System.out.println(second + " second " + minute + " minute and "+ remainingSecond+ " is second ");
		
		
	}
}
