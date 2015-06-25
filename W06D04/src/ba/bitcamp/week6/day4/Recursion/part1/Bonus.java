package ba.bitcamp.week6.day4.Recursion.part1;

public class Bonus {

	public static void turnToOne(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				array[i][j] = 1;

			}
		}

	}

	public static void openField(int i, int j, int[][] arr){
		if(i<0 || j<0 || i>arr.length || j>arr.length){
			return;
		}
		
		if(arr[i][j] == 0){
			turnToOne(arr);
			openField(i+1, j, arr);
			openField(i-1, j, arr);
			openField(i, j+1, arr);
			openField(i, j-1, arr);
		}
		return;
		
	}

	public static void print2DArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] matrix = new int[10][10];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
			}

		}
		print2DArray(matrix);
		
		openField(5, 5, matrix);
		
		System.out.println();
		print2DArray(matrix);

	}

}
