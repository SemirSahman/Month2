package ba.bitcamp.week12.day04.predavanja;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;

public class Client {

	private Socket client;
	private String id;
	private BufferedReader reader;
	private BufferedWriter writer;
	private LinkedBlockingQueue<Message> messages;

	public Client(Socket client) {
		this.client = client;
		id = client.getInetAddress().getHostAddress();
		try {
			reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			writer = new BufferedWriter(new OutputStreamWriter(
					client.getOutputStream()));
			messages = new LinkedBlockingQueue<Message>();
		} catch (IOException e) {
			// TODO Auto-generated catch block
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

	public void close() {
		try {
			client.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addMessage(Message message) {
		messages.add(message);
	}

	public void sendMessage() {
		Iterator<Message> it = messages.iterator();
		try {
			while (it.hasNext()) {
				Message m = it.next();
				writer.write(it.next().getMessage());
				messages.remove(m);

			}

			writer.flush();
		} catch (IOException e) {
			messages.clear();
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

	}

}
