package ba.bitcamp.chatProject2;

import java.net.*;
import java.io.*;

public class ChatClientThread extends Thread {
	private Socket socket = null;
	private ClientChat client = null;
	private DataInputStream streamIn = null;

	public ChatClientThread(ClientChat _client, Socket _socket) {
		this.client = _client;
		this.socket = _socket;
		open();
		start();
	}

	public void open() {
		try {
			streamIn = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			System.out.println("Error getting input stream: " + e);
			client.stop();
			;
		}
	}

	public void close() {
		try {
			if (streamIn != null)
				streamIn.close();
		} catch (IOException e) {
			System.out.println("Error closing input stream: " + e);
		}
	}

	public void run() {
		while (true) {
			try {
				client.handle(streamIn.readUTF());
			} catch (IOException e) {
				System.out.println("Listening error: " + e.getMessage());
				client.stop();
			}
		}
	}
}