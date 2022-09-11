package weeks.week04;

public class loopExample {

	public static void main(String[] args) {
		//Sadece cift indexli harfleri yazdirin.
		String s = "TarikInarAcademy";
		
		int length = s.length();
		System.out.println(s);
		
		for(int i = 0; i < length; i = i +2) {
			System.out.println(s.charAt(i));
		}

	}

}
