package chapters.chapter05;

public class checkpoint16 {

	public static void main(String[] args) {
		//Test Sum.
		
		float sum = 0;
		//Add 0.01, 0.02, ....0.099 1 to sum.
		for(float  i = 0.01f; i <= 1.0f; i = i + 0.01f)
			sum += i;
		//Display result.
		System.out.println("The sum is " +sum);

	}

}
