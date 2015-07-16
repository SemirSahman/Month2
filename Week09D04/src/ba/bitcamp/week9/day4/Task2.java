package ba.bitcamp.week9.day4;

import java.util.HashSet;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		HashSet<Character> set = new HashSet<Character>();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = in.nextLine();

		while (!s.equals("end")) {
			System.out.println("Enter the string: ");
			s = in.nextLine();
			if (s.equalsIgnoreCase("end")) {
				break;
			}
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				set.add(c);
			}

		}
		System.out.println(set);

	}

}
