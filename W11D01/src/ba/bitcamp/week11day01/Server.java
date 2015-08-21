package ba.bitcamp.week11day01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
		try {
			System.out.println("Application started");
			ServerSocket server = new ServerSocket(1946);
			System.out.println("Server Socket made");

			System.out.println("Listening for a Client...");
			Socket client = server.accept();
			System.out.println("Client found!");

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					client.getOutputStream()));
			writer.write("Kakav si familijo?");
			writer.newLine();
			writer.flush();

			System.out.println("Client: " + reader.readLine());
			Scanner input = new Scanner(System.in);
			System.out.println("Msg: ");
			writer.write(input.nextLine());
			writer.flush();

			boolean end = false;
			while (!end) {
				System.out.println("Msg: ");
				writer.write(input.nextLine());
				writer.newLine();
				writer.flush();

				System.out.println("Client: " + reader.readLine());

			}

			System.out.println("Client: " + reader.readLine());

			input.close();
			server.close();

		} catch (BindException e){
			System.out.println("Adress already in use or the server is already running");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
