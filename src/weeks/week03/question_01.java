package weeks.week03;

import java.util.Scanner;

public class question_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your service year : ");
		
		int year = input.nextInt();
		System.out.println("Enter your salary: ");
		int salary = input.nextInt();
		
		if(year>5) {
			double bonus = salary * 0.05;
			System.out.println("Your bonus amount is " + bonus);
		}
		else {
			System.out.println("Your bonus amount is 0 !!!");
		}
	}

}
