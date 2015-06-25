package ba.bitcamp.week6.day4.Recursion.part1;

public class Task6 {

	private static int idx = 0;

	public static Boolean isInArray(int[] array, int n) {
		if (idx == array.length) {
			return false;
		} else if (array[idx] == n) {
			return true;
		}
		idx++;
		return isInArray(array, n);

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int n = 2;

		System.out.println(isInArray(arr, n));

	}

}
