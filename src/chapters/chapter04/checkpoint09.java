package chapters.chapter04;

public class checkpoint09 {

	public static void main(String[] args) {
		//Comparing Strings, equalsIgnoreCase
		
		String str1 = "merhaba java";
		String str2 = "    MerHAba java       \n\t";
		
		boolean b = str1.equalsIgnoreCase(str2.trim());
		if (b) {
			System.out.println("Strings are the same");
		}else {
		System.out.println("Strings aren't the same");
		}
	}
}

