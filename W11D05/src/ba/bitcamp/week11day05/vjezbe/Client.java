package ba.bitcamp.week11day05.vjezbe;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	static Socket socket;
	
	public static void main(String[] args) {
		System.out.println("CLIENT Application started");
		try {
			 socket = new Socket("10.0.82.44", 1946);
			System.out.println("CLIENT connected to localhost");
			
			new ClientGUI(socket);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void sendToServer(String msg) {
		try {
			BufferedWriter writer = new BufferedWriter(
					new OutputStreamWriter(socket.getOutputStream()));

			writer.write(msg);
			writer.newLine();
			writer.flush();

		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	}
