package weeks.week04;

public class interview2 {

	public static void main(String[] args) {
		String deneme = "Inar";
		interview2(deneme);

	}

	public static void interview2(String s) {
		// sadece ingilizce degerler
		// boş string olabilir mi?
		// harf dısı degerler olursa
		// a, e, i ,o ,u => X

		// "Inar" => "XnXr"
		// "Inar.123# => "XnXr.123#"
		// replace a,e,i,o,u,A,E,İ,O,U => X

		String result = s.replace('a', 'X');
		result = result.replace('e', 'X');
		result = result.replace('i', 'X');
		result = result.replace('o', 'X');
		result = result.replace('u', 'X');
		result = result.replace('A', 'X');
		result = result.replace('E', 'X');
		result = result.replace('I', 'X');
		result = result.replace('O', 'X');
		result = result.replace('U', 'X');

		System.out.println("String: " + s);
		System.out.println("Result: " + result);
	}

}
