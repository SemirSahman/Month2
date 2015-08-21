package ba.bitcamp.week14.day05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class Server {

	private static String[] arr = null;
	private static int size;
	private static String filePath;

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(1946);
			Socket client = server.accept();

			OutputStream clientWriter = client.getOutputStream();

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));

			String msg = reader.readLine();

			messageSpliter(msg);
			if(!"GET".equalsIgnoreCase(arr[0])){
				extracted();
			}
			try {
				FileInputStream clientReader = new FileInputStream(new File(
						filePath));
				try {
					byte[] buffer = new byte[size];
					int readBytes;

					while ((readBytes = clientReader.read(buffer, 0,
							buffer.length)) > 0) {
						clientWriter.write(buffer, 0, readBytes);
					}
				} catch (NegativeArraySizeException e) {
					System.out
							.println("Buffered size is invalid, must be number and must be positive");
				}
				clientReader.close();
			} catch (FileNotFoundException e) {
				System.out
						.println("File doesnt exist or the file path is wrong, enter exact file path!");
			}

			clientWriter.close();
			reader.close();
			client.close();

			server.close();

		} catch (SocketException e) {
			System.out.println("Invalid port");
		} catch (IOException e) {
			System.out
					.println("Server address already in use or server may be already running!");
		}

	}

	private static void extracted() {
		throw new IllegalArgumentException("First word must be get");
	}

	public static void messageSpliter(String msg) {
		try {
			arr = msg.split(" ");

			size = Integer.parseInt(arr[2]);

			filePath = arr[1];

		} catch (IllegalArgumentException e) {
			System.out.println("Message is empty");
		}

	}

}
