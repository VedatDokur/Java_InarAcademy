package chapters.chapter05;

import java.util.Scanner;

public class exercise08 {

	public static void main(String[] args) {
		//Find the highest score.
		
		Scanner input = new Scanner(System.in);
		  System.out.print("Enter the number of students:");
		  int n = input.nextInt();
		  int max = 0;
		  String maxName = "";
		 
		  for (int i = 0; i < n; i++) {
		   System.out.print("Enter name and score of student (" + (i + 1) + "):");
		   String name = input.next();
		   int score = input.nextInt();
		   if (score > max) {
		    max = score;
		    maxName = name;
		   }
		 
		  }
		 
		  System.out.println("The student with the highest score is " + maxName);
		  System.out.println("The highest score is " + max);

	}

}
