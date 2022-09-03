package chapters.chapter04;

import java.util.Scanner;

public class checkpoint13 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Write a city");
		String city1 = keyboard.next();

		System.out.println("Write a city name again");
		String city2 = keyboard.next();
		
		if(city1.compareTo(city2) < 0) {
			System.out.println("Enter the cities in order: " +city1 + " " +city2);
		}else {
			System.out.println("Enter the cities in order: " +city2 + " " +city1);
		}
	}
}