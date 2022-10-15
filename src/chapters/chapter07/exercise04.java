package chapters.chapter07;

import java.util.Scanner;

public class exercise04 {

	public static void main(String[] args) {
		//Analyze scores.
		
		final int MAX_NUMBER_OF_SCORE = 100;
		
		Scanner input = new Scanner(System.in);
		
		int[]skor = new int[MAX_NUMBER_OF_SCORE];
		int toplam = 0, ortalama = 0, n = 0;
		System.out.println("Enter a scores, if you write negative value result is will be end.");
		
		for(int i = 0; i < skor.length; i++) {
			skor[i] = input.nextInt();
			
			if(skor[i] < 0) {
				ortalama = toplam / i;
				break;
			}else {
				toplam += skor[i];
				n++;
			}
		}
		int esit = 0, üstDeger = 0, altDeger = 0;
		  for (int i = 0; i < n; i++) {
		   if (skor[i] == ortalama) {
		    esit++;
		   } else if (skor[i] > ortalama) {
		    üstDeger++;
		   } else {
		    altDeger++;
		   }
		 
		  }
		 
		  System.out.println("Sayi ortalamaya esit ise " + esit);
		  System.out.println("Sayinin üst degeri ortalamaya esit ise " + üstDeger);
		  System.out.println("Sayinin alt degeri ortalamaya esit ise " + altDeger);
	}
}
		 
	

