package ba.bitcamp.week6.day4.Recursion.part1;

public class Task7 {

	private static int idx = 0;

	public static Boolean areTheSame(int[] a1, int[] a2) {
		if (a1[idx] != a2[idx]) {
			return false;
		}
		if (idx == a1.length - 1) {
			return true;
		}

		idx++;
		return areTheSame(a1, a2);

	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(areTheSame(arr1, arr2));

	}

}
