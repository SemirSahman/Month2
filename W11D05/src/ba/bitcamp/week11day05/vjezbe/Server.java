package ba.bitcamp.week11day05.vjezbe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private static ServerGUI window;
	
	public static void main(String[] args) {
		System.out.println("Application started");
		try {
			ServerSocket server = new ServerSocket(1946);
			System.out.println("Server Socket made");

			System.out.println("Listening for a Client...");
			Socket client = server.accept();

			window = new ServerGUI();
			
			Thread t = new Thread(new ClientThread(client));
			t.start();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static class ClientThread implements Runnable {

		private Socket client;

		public ClientThread(Socket client) {
			this.client = client;
		}

		@Override
		public void run() {

			BufferedReader reader;
			try {
				reader = new BufferedReader(new InputStreamReader(
						client.getInputStream()));

				
				while(true) {
					String s = reader.readLine();
					window.moveRect(s);					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
