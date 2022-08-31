package chapters.chapter03;

import java.util.Scanner;

public class checkpoint13 {

	public static void main(String[] args) {
		//Logical Operators
		// ! degil-not, && ve-and, || veya-or, ^ rastgele-exclusive or.
		
		/* Example: Age = 24, weight = 140
		 * 
		   !(age < 18) is false, because (age > 18) is true.
		   !(weight == 150) is true, because (weight == 150) is false.
		 
		   && sonucun true olması icin her iki sonucunda true olması gerekir.
		   Herhangi bir false'da sonuc her zaman false olur.
		   
		   || veya'dır.
		   False - false = false
		   False - true = true
		   True - false = true
		   True - true = true
		   
		   ^
		   false - false = false
		   false - true = true
		   true - false = true
		   true - true = false  */
		
		Scanner keyboard = new Scanner(System.in);
			
			System.out.println("Enter a num: ");
			int num = keyboard.nextInt();
			
			if(num % 2 == 0 && num % 3 == 0) {
				System.out.println("Your nums are dividing 2 and 3. ");
			}
			if (num % 2 == 0 || num % 3 == 0) {
				System.out.println("Your nums are dividing 2 or 3. ");
			}
			if (num % 2 == 0 ^ num % 3 == 0) {
				System.out.println("The number you entered is divisible or two and three, but not both.");
		}
	}
}

		
		
	

