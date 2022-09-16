package chapters.chapter05;

public class exercise27 {

	public static void main(String[] args) {
		//Display leap years.
		
		int noLeapYear = 0;
		
		for(int year = 101; year <= 2100; year++) {
			boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
			
			if(isLeapYear) {
				noLeapYear++;
				System.out.println(year + " ");
				if(noLeapYear % 10 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println("\nThe number of leap year between 100 and 2100 is " + noLeapYear);
	}

}
