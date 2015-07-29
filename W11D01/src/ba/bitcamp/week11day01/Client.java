package ba.bitcamp.week11day01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		try {
			System.out.println("CLIENT Application started");
			Socket socket = new Socket("10.0.82.18", 5555);
			System.out.println("CLIENT connected to localhost");

			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));

			System.out.println("Server: " + reader.readLine());
			writer.write("Dobar ti braca lave?");
			writer.newLine();
			writer.flush();

			Scanner input = new Scanner(System.in);
			// System.out.println("Msg: ");
			// writer.write(input.nextLine());
			// writer.newLine();
			// writer.flush();

			FileOutputStream fileOutput = new FileOutputStream("output.jpg");
			InputStream is = socket.getInputStream();

			byte[] data = new byte[1024];
			int bytesRead;

			while ((bytesRead = is.read(data, 0, 1024)) > 0) {
				fileOutput.write(data, 0, bytesRead);
			}

			is.close();
			/*
			 * boolean end = false; while (!end) { System.out.println("Server: "
			 * + reader.readLine());
			 * 
			 * System.out.println("Msg: "); writer.write(input.nextLine());
			 * writer.newLine(); writer.flush();
			 * 
			 * }
			 */

			input.close();
			reader.close();
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
