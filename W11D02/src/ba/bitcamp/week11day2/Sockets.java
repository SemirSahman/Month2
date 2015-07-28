package ba.bitcamp.week11day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Sockets {

	public static void main(String[] args) {

		String msg = "";

		try {
			System.out.println("Searching connection");
			ServerSocket ss = new ServerSocket(8888);
			Socket client = ss.accept();
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			String ip = client.getInetAddress().getHostAddress();
			String name = ClientHashMap.getName(ip);
			msg = reader.readLine();
			System.out.println("Connected");

			Scanner in = new Scanner(System.in);
			System.out.println("Primljeno: " + msg);
			System.out.print("Ukucaj poruku: ");
			msg += " " + in.nextLine();

			Socket clientZaid = new Socket("10.0.82.98", 8888);
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					clientZaid.getOutputStream()));
			writer.write(msg);
			writer.newLine();
			writer.flush();

			System.out.println("Message sent to Zaid");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (true) {
			try {
				String keyString = "";
				try {
					keyString = ClientHashMap.getIP();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Socket client2 = new Socket(keyString, 8888);

				BufferedWriter writer2 = new BufferedWriter(
						new OutputStreamWriter(client2.getOutputStream()));
				writer2.write(msg);
				writer2.newLine();
				writer2.flush();

				System.out.println(ClientHashMap.map.get(keyString));

				System.out.println("Connection succesfull");
				break;
			} catch (IOException e) {
				System.out.println("Server is turned off");
			}
		}
	}

}
