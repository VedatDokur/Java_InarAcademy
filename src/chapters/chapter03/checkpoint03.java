package chapters.chapter03;

import java.util.Scanner;

public class checkpoint03 {

	public static void main(String[] args) {
		//Random process.
		int num1 = (int)(System.currentTimeMillis() %10);
		int num2 = (int)(System.currentTimeMillis() / 7 % 10);
		//  /7 kullanmamizin sebebi, 9.satirdaki islemden sonra mili saniye bile gecmedigi icin 10.satirda da ayni sorucu verir bu yüzden /7 kullaniyoruz ki farklı sonuclar elde edelim.
		
		System.out.println(num1 + " + " + num2 + " = ?");
		Scanner keyboard = new Scanner(System.in);
		
		int total = keyboard.nextInt();
		if(num1 + num2 == total) {
			System.out.println("Answer is true");
		}else {
			System.out.println("Answer is false");
		}

	}

}
