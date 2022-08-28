package chapters.chapter03;

import java.util.Scanner;

public class checkpoint05 {

	public static void main(String[] args) {
		//Course score.
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your course score: (Between 0 and 100)");
		
		int courseScore = keyboard.nextInt();
		
		if(courseScore >= 90) {
			System.out.println("Course Score is A");
		}
		if(courseScore >= 80 && courseScore <90) {
			System.out.println("Course Score is B");
		}
		
	}

}
