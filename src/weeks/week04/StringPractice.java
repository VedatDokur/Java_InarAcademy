package weeks.week04;

public class StringPractice {
	public static void main(String[] args) {
		charAt();
	}

	public static void substring() {
		String temp = "Inar Academy";
		String yeni = temp.substring(3, 9);
		System.out.println(temp);
		System.out.println(yeni);
	}

	public static void length() {
		String temp = "I love Inar Academy";
		int length = temp.length();
		System.out.println(length);
	}

	public static void memorySpacePractice() {
		String a = "abc";
		String b = "abc";
		String c = "def";
		b = c;
		String d = new String("abc");
		// System.out.println(a == b);
		// System.out.println(a == c);
		System.out.println(a.equals(c));
	}

	public static void equalsIgnorecase() {
		String temp1 = "Vedat";
		String temp2 = "VeDaT";
		String temp3 = "Fenerbahceli Vedat.";
		System.out.println(temp1.equalsIgnoreCase(temp2));
		System.out.println(temp1.equalsIgnoreCase(temp3));

	}
	public static void contains() {
		String name = "Fenerbahce sen cok yasa";
		System.out.println(name.contains("Fenerbahce"));
		System.out.println(name.contains("sen"));
		System.out.println("gs");
	}
	
	public static void trim() {
		String example = "   Welcome Back!";
		System.out.println(example);
		System.out.println(example.trim());
	}
	public static void charAt() {
		String example1 = "Fenerbahce";
		char result = example1.charAt(5);
		System.out.println(result);
	}
	public static void toLowerCase() {
		String example = "Welcome to DE";
		System.out.println(example.toLowerCase());
	}
	public static void toUpperCase() {
		String example = "Welcome to DE";
		System.out.println(example.toUpperCase());
	}
}
/*Anlat
* Örnekle
* Algoritmani sözel
* Test case olustur
* Kod yaz
* Test et */