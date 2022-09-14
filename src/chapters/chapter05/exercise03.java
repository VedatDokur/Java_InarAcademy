package chapters.chapter05;

public class exercise03 {

	public static void main(String[] args) {
		//Conversion from kilograms to pounds.
		
		final int Finish = 199;
		System.out.printf("%8s%10s\n","Kilograms","Pounds");
		
		for (int i = 1; i <= Finish; i++) {
			System.out.printf("%-5d%10.1f\n",i,i*2.2);
		}

	}

}
