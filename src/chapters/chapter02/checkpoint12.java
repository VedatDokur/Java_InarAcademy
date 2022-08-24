package chapters.chapter02;

public class checkpoint12 {
	public static void main(String[] args) {
        //Assignment operator.

        int number = 10;
        number = number + 5 ;
        System.out.println(number);

        int number2=5;
        number += 5;
        System.out.println(number2);

        int a,b,c,d;

        d=5;
        a=b=c=d += 10;
        System.out.println(a);
	}
}
