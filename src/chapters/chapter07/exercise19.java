package chapters.chapter07;

import java.util.Scanner;

public class exercise19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter list: ");
		  Scanner input = new Scanner(System.in);
		  int n = input.nextInt();
		  int[] list = new int[n];
		 
		  for (int i = 0; i < list.length; i++) {
		   list[i] = input.nextInt();
		  }
		 
		  String s = " not ";
		  if (isSorted(list))
		   s = " already ";
		 
		  System.out.print("The list is" + s + "sorted");
		 
		 }
		 
		 public static boolean isSorted(int[] list) {
		 
		  int n = list.length - 1;
		  boolean isSorted = true;
		 
		  for (int i = 0; i < n; i++) {
		   if (list[i] > list[i + 1]) {
		    isSorted = false;
		    break;
		   }
		  }
		 
		  return isSorted;
	}

}
