package weeks.week03;
import java.util.*;

public class question_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three ages: ");
		
		int age1 = input.nextInt();
		int age2 = input.nextInt();
		int age3 = input.nextInt();
		
		//a1=25 a2=20 a3=30
		if(age1<age2){
			int temporaryAge= age2; //temp =20
			age2 = age1; //age2 =25
			age1 = temporaryAge; //age1 =20
		}
		if(age1<age3) {
			int temporaryAge= age3; //temp= 30
			age3 = age1; //age3 =20
			age1 = temporaryAge; //age1 = 30
			//a1=30 a2= 25 a=20	
		}
		if(age2<age3) {
			int temporaryAge= age3; //temp=20
			age3 = age2; // age3 =25
			age2 = temporaryAge; //age2= 20
		}
		System.out.println("Yaslarin siralamasi: " + age1 +" " + age2 +" " + age3);
	}

}
