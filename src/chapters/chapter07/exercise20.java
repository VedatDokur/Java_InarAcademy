package chapters.chapter07;

import java.util.Scanner;

public class exercise20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];

		System.out.print("Enter ten numbers:");

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}

		System.out.print("The sorted numbers are:");

		selectionSort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

	public static void selectionSort(int[] list) {
		for (int i = list.length - 1; i > 0; i--) {
			
			int currentMax = list[i];
			int currentMaxIndex = i;

			for (int j = 0; j < i; j++) {
				if (currentMax < list[j]) {
					currentMax = list[j];
					currentMaxIndex = j;
				}
			}

			
			if (currentMaxIndex != i) {
				list[currentMaxIndex] = list[i];
				list[i] = currentMax;
			}
		}
	}
}

/*Bubble sort, en basit sıralama algoritmalarından biridir. 
Karşılaştırma temelli olan bu algoritmada, listedeki her 
bir eleman yanındaki eleman ile karşılaştırılır. 
Eğer ilk elemanın değeri, ikinci elemanın değerinden büyükse, 
iki eleman yer değiştirir. Daha sonra ikinci ve üçüncü 
elemanların değerleri karşılaştırılır. İkinci elemanın değeri 
üçüncü elemanın değerinden büyükse bu iki eleman yer değiştirir 
ve bu işlem, tüm liste sıralanana kadar bu şekilde devam eder.*/

/*Selection sort algoritması ile sıralanmamış bir listede her 
 * iterasyonda en küçük eleman bulunur. İterasyon sonunda belirlenen 
 * en küçük eleman listenin başında bulunan eleman ile yer değiştirir. 
 * Bir sonraki iterasyona dahil edilmez. İkinci iterasyonda yine array 
 * elemanlarından en küçük olanı bulunur ve bu sefer listedeki 
 * 2.eleman ile yer değiştirir ve bu şekilde liste sıralanana kadar devam eder.
 */