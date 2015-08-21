package ba.bitcamp.week11day01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class RingSender {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(1946);
			Socket fromAdis = server.accept();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					fromAdis.getInputStream()));
			String message = reader.readLine();
			System.out.println("Od Adisa: " + message);

			
			Socket socket = new Socket("10.0.82.27", 2506);

			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));

			writer.write(message);
			writer.newLine();
			writer.close();
			System.out.println("Poslao sam poruku Djomli");
			
			
			socket.close();
			server.close();
			


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
