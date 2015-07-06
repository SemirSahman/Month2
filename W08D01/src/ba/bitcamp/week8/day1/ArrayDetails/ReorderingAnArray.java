package ba.bitcamp.week8.day1.ArrayDetails;

import java.util.Arrays;

public class ReorderingAnArray {

	public static int[] reorder(int[] arr) {
		int counter = 0;
		int[] arr2 = new int[arr.length];

		for (int i : arr) {
			if (counter % 2 == 0) {
				arr2[counter] = i;
				counter++;
			}

		}
		for (int i : arr) {
			if (counter % 2 != 0) {
				arr2[counter] = i;
				counter++;
			}
		}
		return arr2;

	}
	
	

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(Arrays.toString(reorder(arr)));
	}

}
