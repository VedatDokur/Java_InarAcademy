package chapters.chapter04;

public class checkpoint06 {

	public static void main(String[] args) {

		//String Class.
		
		String str = "Hello Java! ";
		System.out.println(str.length());
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(9));
		
		String str2= "Java is good.";
		String str3= str.concat(str2);
		
		System.out.println(str3);
		
		System.out.println(str+ str2);
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		str = "       itsnotgood         ";
		System.out.println(str);
		
	}

}
