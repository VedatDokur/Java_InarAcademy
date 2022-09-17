package chapters.chapter05;

import java.util.Scanner;

public class exercise49 {

	public static void main(String[] args) {
		//Count vowels and consonants.
		
		Scanner input = new Scanner(System.in);
		  System.out.print("Enter a string:");
		  String s = input.nextLine();
		  String s2 = "";
		  int numVowel = 0;
		  int numCon = 0;
		 
		  for (int i = s.length() - 1; i >= 0; i--) {
		   switch (s.toLowerCase().charAt(i)) {
		   case 'a':
		   case 'e':
		   case 'i':
		   case 'o':
		   case 'u':
		    numVowel++;
		    break;
		   case ' ':
		    break;
		   default:
		    numCon++;
		    break;
		 
		   }
		  }
		 
		  System.out.println("The number of vowels is " + numVowel);
		  System.out.println("The number of consonants is " + numCon);
		 
	}

}
