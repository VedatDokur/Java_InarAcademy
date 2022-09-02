package chapters.chapter04;

public class checkpoint01 {

	public static void main(String[] args) {
		
		// Math methods.
		System.out.println("--------CEIL-------");
		System.out.println(Math.ceil(3.0));
		System.out.println(Math.ceil(3.1));
		System.out.println(Math.ceil(3.5));
		System.out.println(Math.ceil(3.8));

		System.out.println("-------FLOOR-------");
		System.out.println(Math.floor(3.0));
		System.out.println(Math.floor(3.1));
		System.out.println(Math.floor(3.5));
		System.out.println(Math.floor(3.8));

		System.out.println("-------R-INT-------");
		System.out.println(Math.rint(3.0));
		System.out.println(Math.rint(3.1));
		System.out.println(Math.rint(3.4999999));
		System.out.println(Math.rint(3.4999999999999999999));
		System.out.println(Math.rint(3.5));
		System.out.println(Math.rint(3.8));

		System.out.println("-------ROUND-------");
		System.out.println(Math.round(3.0));
		System.out.println(Math.round(3.1));
		System.out.println(Math.round(3.5));
		System.out.println(Math.round(3.8));

		int i = (int) (Math.random() * 34) + 15;
		System.out.println(i);

	}

}
