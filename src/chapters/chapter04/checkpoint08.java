package chapters.chapter04;

public class checkpoint08 {

	public static void main(String[] args) {
		//Comparing Strings.
		
		String str1 = "Merhaba Java";
		//String str2 = "Merhaba Java ";
		//boolean b =str1.equals(str2.trim());
		//trim aradaki bosluklari temizler.
		
		String str2 = "Merhaba Java Sinifi";
		
		boolean b =str1.equals(str2);
		
		if(b) {
			System.out.println("Thats strings are the same ");
		}else {
			System.out.println("Thats strings aren't the same");
		}
	}

}
