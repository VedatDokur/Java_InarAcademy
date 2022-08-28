package weeks.week03;
import java.util.*;

public class question_03 {

	public static void main(String[] args) {
		//
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 4-Digit Number: ");
		int number = input.nextInt();
		
		//Number = 1345 
		int d4 = number / 1000; //d4 = 1
		int remainingnum = (number % 1000); //kalan = 345
		int d3 = remainingnum / 100; //d3 = 3
		remainingnum = (number % 100); //kalan = 45
		int d2 = remainingnum / 10; //d2 = 4
		int d1 = remainingnum % 10; //d1 = 5
		
		System.out.println("Reverse Number: " + d1 + d2 + d3 + d4);
	}

}
