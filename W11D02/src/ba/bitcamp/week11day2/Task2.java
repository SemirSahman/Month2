package ba.bitcamp.week11day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Task2 {

	public static void main(String[] args) {
		try {
			System.out.println("CLIENT Application started");
			Socket socket = new Socket("10.0.82.98", 7777);
			System.out.println("CLIENT connected to localhost");

			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));

			FileOutputStream fileOutput = new FileOutputStream("output.txt");
			InputStream is = socket.getInputStream();

			byte[] data = new byte[1024];
			int bytesRead;

			while ((bytesRead = is.read(data, 0, 1024)) > 0) {
				fileOutput.write(data, 0, bytesRead);
			}

			is.close();
			reader.close();
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
