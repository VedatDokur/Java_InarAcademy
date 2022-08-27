package weeks.week03;

import java.util.*;

public class question_022 {

	public static void main(String[] args) {
		//
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three ages: ");

		int age1 = input.nextInt();
		int age2 = input.nextInt();
		int age3 = input.nextInt();

		// age1 = 20 age2 = 75 age3 = 7
		if (age1 > age2) {
			int tempAge = age1; // burada age1 degerini tempe atadik. // temp= 20
			age1 = age2; // age1 degeri 75 oldu.
			age2 = tempAge; // burada temp degerini age2 aktardik. // age2 = 20
		}
		if (age1 > age3) {
			int tempAge = age1; // temp = 20
			age1 = age3; // age1 = 7
			age3 = tempAge; // age3= 20
		}
		if (age2 > age3) {
			int tempAge = age2; // temp = 75
			age2 = age3; // age2 =7
			age3 = tempAge; // age3 = 75
		}

		System.out.println("Sayilari kücükten büyüge dogru siralayiniz: " + age1 + " " + age2 + " " + age3);
	}

}
