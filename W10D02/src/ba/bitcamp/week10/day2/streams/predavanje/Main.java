package ba.bitcamp.week10.day2.streams.predavanje;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Main {

	public static void printByteArray(byte[] array) {
		for (byte b : array) {
			System.out.println((char) b);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		InputStream is = null;
		OutputStream os = null;


		Reader r = new InputStreamReader(System.in);
		Writer w = new OutputStreamWriter(System.out);

		BufferedReader br = new BufferedReader(r);
		BufferedWriter bw = new BufferedWriter(w);

		byte[] buffer = new byte[3];

		try {
			is = new FileInputStream("src/ba/bitcamp/week10/day2/streams/predavanje/nesto.txt");
			os = new FileOutputStream("src/ba/bitcamp/week10/day2/streams/predavanje/copynesto.txt");
			int read = 0;
			do {
				read = is.read(buffer);
				os.write(buffer, 0, read);
			} while (is.available() > 0);
			String msg = "Hello World";
			buffer = msg.getBytes();

			os.write(buffer);

		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		System.out.println("Done");

	}
}
