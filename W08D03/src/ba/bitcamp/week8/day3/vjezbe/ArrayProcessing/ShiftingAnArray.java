package ba.bitcamp.week8.day3.vjezbe.ArrayProcessing;

import java.util.Arrays;

public class ShiftingAnArray {

	public static void shiftArray(char[] arr) {
		char tmp = arr[0];
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = tmp;

	}

	public static void main(String[] args) {
		char[] arr = { 'A', 'B', 'C', 'D' };
		shiftArray(arr);
		System.out.println(Arrays.toString(arr));

	}

}
