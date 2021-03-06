package ba.bitcamp.chatProject5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client implements Runnable {

	private Socket client;
	private BufferedReader reader;
	private BufferedWriter writer;
	private String id;
	private Thread runningThread = null;

	public Client(Socket client) {
		this.client = client;
		id = client.getInetAddress().getHostAddress();
		try {
			reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			writer = new BufferedWriter(new OutputStreamWriter(
					client.getOutputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getId() {
		return id;
	}

	public BufferedReader getReader() {
		return reader;
	}

	public BufferedWriter getWriter() {
		return writer;
	}

	@Override
	public void run() {
		

	}

	public static void main(String[] args) {
		try {
			Socket client = new Socket("10.0.82.44", 1946);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
