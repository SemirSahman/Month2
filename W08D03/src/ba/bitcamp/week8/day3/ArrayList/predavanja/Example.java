package ba.bitcamp.week8.day3.ArrayList.predavanja;

import java.util.ArrayList;

public class Example {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {

			int rand = (int) (Math.random() * 10);
			a.add(rand);
		}
		System.out.println(a);
		while (a.indexOf(2) != -1) {
			a.remove((Integer) 2);
		}
		System.out.println(a);

	}
}
