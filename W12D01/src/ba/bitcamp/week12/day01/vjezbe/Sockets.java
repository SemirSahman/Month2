package ba.bitcamp.week12.day01.vjezbe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import org.codehaus.jackson.map.ObjectMapper;

public class Sockets {

	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper();

		try {
			ServerSocket server = new ServerSocket(8000);
			Socket client = server.accept();

			FileOutputStream fileOutput = new FileOutputStream(
					"/Users/semir.sahman/Desktop/file.json");
			InputStream is = client.getInputStream();

			byte[] data = new byte[1024];
			int bytesRead;

			while ((bytesRead = is.read(data, 0, 1024)) > 0) {
				fileOutput.write(data, 0, bytesRead);
				fileOutput.flush();
			}
			System.out.println("Message has been received!");

			try {
				ArrayList<Message> s1 = (ArrayList<Message>) mapper.readValue(
						new File("/Users/semir.sahman/Desktop/file.json"),
						ArrayList.class);
				System.out.println("JSON file readed");

				Message message = new Message("Operation: Neum", "Minuli vikend",
						"Hasib pocrnio na terasi u Kaknju, nije isao u Neum");
				s1.add(message);

				mapper.writeValue(new File(
						"/Users/semir.sahman/Desktop/file.json"), s1);
				Socket socket = new Socket("10.0.82.36", 8000);
				FileInputStream fileInput = new FileInputStream(
						"/Users/semir.sahman/Desktop/file.json");
				OutputStream os = socket.getOutputStream();

				byte[] data2 = new byte[1024];
				int bytesRead2;

				while ((bytesRead2 = fileInput.read(data2, 0, 1024)) > 0) {
					os.write(data2, 0, bytesRead2);
					os.flush();
				}
				System.out.println("Message has been sent!");
				System.out.println(s1);
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}