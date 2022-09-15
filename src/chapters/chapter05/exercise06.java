package chapters.chapter05;

public class exercise06 {

	public static void main(String[] args) {
		//Conversion from miles to kilometers.
		
		final int END = 10;
		  final int milesStart = 20;
		 
		  // printing table header
		  System.out.printf("%-8s%10s", "Miles", "Kilometers");
		  System.out.print("\t|\t");
		  System.out.printf("%-8s%10s\n", "Kilometers", "Miles");
		 
		  for (int j = 0, i = 1; i <= END; i++, j += 5) {
		   System.out.printf("%-8d%10.3f", i, i * 1.609);
		   System.out.print("\t|\t");
		   System.out.printf("%-8d%10.3f\n", milesStart + j,
		     (milesStart + j) / 1.609);
		  }
	}
}

	

