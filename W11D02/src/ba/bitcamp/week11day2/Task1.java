package ba.bitcamp.week11day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		try {
			System.out.println("CLIENT Application started");
			Socket socket = new Socket("10.0.82.98", 8888);
			System.out.println("CLIENT connected to localhost");

			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));

			writer.write("Mase zna se");
			writer.newLine();
			writer.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
