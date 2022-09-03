package chapters.chapter04;

public class checkpoint14 {

	public static void main(String[] args) {
		// Substring beginIndex, endIndex

		String str = "Merhaba Java";
		String str2 = str.substring(6);
		System.out.println(str2);
		
		str2 = str.substring(3, 7);
		System.out.println(str2);
		
		str2 = str.replaceAll("haba", "gurkan");
		System.out.println(str2);
		
		String message = "Welcome to Java";
		message = message.substring(0, 11) + "HTML";
		System.out.println(message);
	}

}
