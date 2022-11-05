package chapters.chapter09;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class exercise05 {

    public static void main(String[] args) {

	
		// TODO Auto-generated method stub
		
	System.out.println(new Date().toString());

    
    GregorianCalendar calendar = new GregorianCalendar();
    calendar.setTimeInMillis(1234567898765L);

   
    System.out.printf("Year: %d Month: %d Day: %d", calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE));
    }
}



	

