package ba.bitcamp.week10.day2.streams.vjezbe;

import java.io.PrintWriter;

public class Task2 {

	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out);
		int offset = 0;

		char[] arr = new char[26];

		int counter = 65;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (char) counter;
			counter++;
		}

		try {
			while (offset < arr.length) {
				pw.write(arr, offset, 10);
				pw.flush();
				offset += 10;
			}
		} catch (IndexOutOfBoundsException e) {
			pw.write(arr, offset, 6);
			pw.flush();
		}

	}
}
