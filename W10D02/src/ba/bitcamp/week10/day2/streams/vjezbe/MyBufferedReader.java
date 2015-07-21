package ba.bitcamp.week10.day2.streams.vjezbe;

import java.io.InputStream;

public class MyBufferedReader {

	private InputStream is;

	public MyBufferedReader(InputStream is) {
		super();
		this.is = is;
	}

	public static void read() {
		try {
			read();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void readLine() {
		try {
			readLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void read(char[] c) {
		try {
			read(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void read(char[] c, int num1, int num2) {
		try {
			read(c, num1, num2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void close() {
		try {
			close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void ready() {
		try {
			ready();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
