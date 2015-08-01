package ba.bitcamp.dataStructures;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {

				return o2 - o1;
			}
		});

		set.add(5);
		set.add(1);
		set.add(3);

		System.out.println(set);

	}

}
