package ba.bitcamp.week6.day4.Recursion.part1;

public class Task3 {

	public static int getSum(int n) {
		int sum = 0;
		if (n == 0) {
			return 0;
		}
		sum += n + getSum(n - 1);
		return sum;

	}

	public static void main(String[] args) {
		System.out.println(getSum(100));

	}

}
