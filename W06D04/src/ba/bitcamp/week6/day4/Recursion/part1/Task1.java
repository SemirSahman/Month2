package ba.bitcamp.week6.day4.Recursion.part1;

public class Task1 {

	public static void print(String msg, int n) {
		if (n == 0) {
			return;
		}

		System.out.println(msg);
		print(msg, n - 1);

	}

	public static void main(String[] args) {
		print("Sarajevo sampion", 5);

	}

}
