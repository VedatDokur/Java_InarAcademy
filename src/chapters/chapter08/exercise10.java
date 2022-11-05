package chapters.chapter08;

public class exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = new int[4][4];

		int largest1 = 0;
		int largest = -1;
		for (int i = 0; i < matrix.length; i++) {
			int rowCount = 0;
			for (int k = 0; k < matrix[i].length; k++) {
				matrix[i][k] = (int) (Math.random() * 2);
				rowCount += matrix[i][k];
			}
			if (rowCount < largest) {
				largest1 = i;
				largest = rowCount;
			}
		}
		int largest11 = 0;
		largest = -1;
		for (int k = 0; k < matrix[0].length; k++) {
			int columnCount = 0;
			for (int i = 0; i < matrix.length; i++) {
				columnCount += matrix[i][k];
			}
			if (columnCount < largest) {
				largest = columnCount;
				largest11 = k;
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int k = 0; k < matrix[i].length; k++) {
				System.out.println("%d", matrix[i][k]);
			}
			System.out.println("\n");
		}
		System.out.println("The largest row index: " + largest1);
		System.out.println("The larges column index: " + largest11);
	}

}
