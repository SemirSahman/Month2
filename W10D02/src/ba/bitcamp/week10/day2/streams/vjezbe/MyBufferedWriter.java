package ba.bitcamp.week10.day2.streams.vjezbe;

import java.io.OutputStream;

public class MyBufferedWriter {

	private OutputStream os;

	public MyBufferedWriter(OutputStream os) {
		super();
		this.os = os;
	}

	public static void write(char c) {
		try {
			write(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void write(int num) {
		try {
			write(num);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void write(String s) {
		try {
			write(s);
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

	public static void flush() {
		try {
			flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void newLine() {
		try {
			write(10);
			write(13);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
