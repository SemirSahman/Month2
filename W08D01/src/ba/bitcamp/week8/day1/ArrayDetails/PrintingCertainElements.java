package ba.bitcamp.week8.day1.ArrayDetails;

public class PrintingCertainElements {

	public static void main(String[] args) {

		char[] chars = { 'a', 'A', 'b', 'B', 'C' };

		for (int i : chars) {
			if (i > 64 && i < 91) {
				System.out.println(Character.toChars(i));
			}
		}

	}

}
