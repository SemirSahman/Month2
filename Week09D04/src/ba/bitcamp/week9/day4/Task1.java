package ba.bitcamp.week9.day4;

import java.util.ArrayList;
import java.util.ListIterator;

public class Task1 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		for (int i = 0; i < 20; i++) {
			list.add((int) (Math.random() * 50 + 50));
		}
		
		System.out.println(list);

		ListIterator<Integer> iter = list.listIterator();

		while (iter.hasNext()) {
			list2.add(iter.next());
		}

		while (iter.hasPrevious()) {
			list2.add(iter.previous());
		}
		
		System.out.println(list2);

	}
}
