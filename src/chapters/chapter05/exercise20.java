package chapters.chapter05;

public class exercise20 {

	public static void main(String[] args) {
		//Display prime numbers between 2 and 1,000.
		
		final int upperBound = 1000; // Upper bound
	    final int npl = 8; // Display 10 per line
	    int count = 0; // Count the number of prime numbers
	    int num = 2; // A number to be tested for primeness
	 
	    System.out.println("The prime numbers in from 2 to 1000 are");
	 

	    while (num <= upperBound) {
	      boolean isPrime = true;
	 

	      for (int divisor = 2; divisor <= num / 2; divisor++) {
	        if (num % divisor == 0) { //Eger doğruysa sayi asal değil.
	          isPrime = false; 
	          break; //Döngüden çıkış.
	        }
	      }
	 

	      if (isPrime) {
	        count++; //Değeri arttır.
	 
	        if (count % npl == 0) {

	          System.out.println(num);
	        }
	        else
	          System.out.print(num + " ");
	      }
	 
	      num++;
	    }
	}
}

	


