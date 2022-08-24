package chapters.chapter02;

public class checkpoint14 {
	public static void main(String[] args) {
        //Type Conversion.

        int i = 5;
        long l =i;
        i = (int)l;

        System.out.println(i);
        System.out.println(l);

        l=2148000000L;
        i = (int)l;

        System.out.println(i);
        System.out.println(l);

        int number= 2_147_483_647;

        number= number +1 ;
        System.out.println(number);

        byte b = 127;
        b++;
        System.out.println(b);

        number= (int)(i*1);


    }

}

