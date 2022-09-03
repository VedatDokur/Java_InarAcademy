package chapters.chapter04;

public class checkpoint15 {

	public static void main(String[] args) {
		//Finding Substring
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
		
		System.out.println(message.indexOf('o'));
		System.out.println(message.indexOf('o', 5));
		
		System.out.println("Welcome to Java".indexOf('W'));
		System.out.println("Welcome to Java".indexOf('o'));
		System.out.println("Welcome to Java".indexOf('o', 5));
		System.out.println("Welcome to Java".indexOf("come"));
		System.out.println("Welcome to Java".indexOf("java", 5));
		System.out.println("Welcome to Java".lastIndexOf("java", 5));
		System.out.println("Welcome to Java".lastIndexOf('W'));
		System.out.println("Welcome to Java".lastIndexOf('o'));
		System.out.println("Welcome to Java".lastIndexOf('o', 5));
		System.out.println("Welcome to Java".lastIndexOf("come"));
		System.out.println("Welcome to Java".lastIndexOf("Java", 5));
		System.out.println("Welcome to Java".lastIndexOf("Java"));
		
		//indexof -1 veriyorsa o değer bizde yoktur.
	}

}
