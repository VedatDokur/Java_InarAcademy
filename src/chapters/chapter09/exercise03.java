package chapters.chapter09;

import java.util.Date;

public class exercise03 {

	// TODO Auto-generated method stub

	public static void main(String[] args) {
		Date date;
		long time = 10000;
		for (int i = 0; i < 8; i++, time *= 10) {
			date = new Date(time);
			System.out.println(date.toString());
		}
	}
}
