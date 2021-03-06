package ba.bitcamp.week8.day3.vjezbe.ArrayProcessing;

import java.util.Arrays;

public class FillArray {

	public static int[] fillArray(int numOfElements, int numToPutInArray,
			int startingIndex, int endingIndex) {

		int[] array = new int[numOfElements];
		Arrays.fill(array, -1);
		Arrays.fill(array, startingIndex, endingIndex, numToPutInArray);

		return array;
	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(fillArray(6, 3, 3, 5)));
	}
}
