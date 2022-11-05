package chapters.chapter08;

import java.util.Scanner;

public class exercise16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of data pairs:");

		int[][] data = new int[input.nextInt()][2];

		System.out.print("Enter data pairs:");

		for (int i = 0; i < data.length; i++) {
			data[i][0] = input.nextInt();
			data[i][1] = input.nextInt();
		}
		sort(data);

		System.out.println("The sorted array:");
		for (int i = 0; i < data.length; i++) {
			System.out.print("{" + data[i][0] + "," + data[i][1] + "}");
		}

	}

	public static void sort(int[][] list) {
		for (int i = 0; i < list.length - 1; i++) {

			int currentMinRow = list[i][0];
			int currentMinCol = list[i][1];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++) {

				if (currentMinRow > list[j][0]) {
					currentMinRow = list[j][0];
					currentMinCol = list[j][1];
					currentMinIndex = j;
				} else if (currentMinRow == list[j][0] && currentMinCol > list[j][1]) {

					currentMinCol = list[j][1];
					currentMinIndex = j;
				}
			}

			if (currentMinIndex != i) {
				list[currentMinIndex][0] = list[i][0];
				list[i][0] = currentMinRow;
				list[currentMinIndex][1] = list[i][1];
				list[i][1] = currentMinCol;

			}
		}
	}

}
