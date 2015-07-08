package ba.bitcamp.week8.day3.ArrayList.predavanja;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListStringOfFour {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList(Arrays.asList("this", "is", "lots",
				"of", "fun", "for", "every", "java", "programer"));

		System.out.println(a.toString());

		ArrayList<String> b = new ArrayList();
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).length() == 4) {
				b.add("****");
				b.add(a.get(i));
			} else {
				b.add(a.get(i));
			}
		}
		System.out.println(b.toString());

	}

}
