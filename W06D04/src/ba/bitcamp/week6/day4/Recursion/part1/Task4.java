package ba.bitcamp.week6.day4.Recursion.part1;

public class Task4 {

	public static int getFibonacciNumber(int n) {
		int sum = 0;
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		sum += getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
		return sum;

	}

	public static void main(String[] args) {

		System.out.println(getFibonacciNumber(8));

	}

}
