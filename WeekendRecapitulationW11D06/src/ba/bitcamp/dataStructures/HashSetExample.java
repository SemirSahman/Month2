package ba.bitcamp.dataStructures;

import java.awt.Point;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {

		HashSet<Point> set = new HashSet<>();

		// set.add(2);
		// set.add(1);
		// set.add(5);

		set.add(new Point(5, 0));
		set.add(new Point(0, 0));
		set.add(new Point(3, 2));
		set.add(new Point(1, 1));
		set.add(new Point(3, 3));
		set.add(new Point(6, 2));
		set.add(new Point(2, 6));

		Iterator<Point> it = set.iterator();
		int counter = 0;
		while (it.hasNext()) {

			Point p = it.next();
			if (counter % 2 == 0) {
				System.out.println(p.x + " " + p.y);
			}

			counter++;
		}

		System.out.println(set);

	}

}
