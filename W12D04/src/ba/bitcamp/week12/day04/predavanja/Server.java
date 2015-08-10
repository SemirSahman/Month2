package ba.bitcamp.week12.day04.predavanja;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class Server {

	private static LinkedBlockingQueue<Client> clients;
	private static LinkedBlockingQueue<Message> messages;
	private static ExecutorService pool = Executors.newFixedThreadPool(8);

	public static void main(String[] args) {

		clients = new LinkedBlockingQueue<>();
		messages = new LinkedBlockingQueue<>();

		pool.submit(new Listener());
		pool.submit(new Listener());
		pool.submit(new Listener());
		pool.submit(new Listener());
		pool.submit(new Listener());
		pool.submit(new Listener());
		pool.submit(new Listener());
		pool.submit(new Listener());

		try {
			ServerSocket server = new ServerSocket(6815);
			while (true) {
				Socket client = server.accept();
				clients.add(new Client(client));

				new Thread(new Listener()).start();
				new Thread(new Sender()).start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static class Listener implements Runnable {

		@Override
		public void run() {
			Client c = null;
			try {
				c = clients.take();
				clients.add(c);
				
				BufferedReader reader = c.getReader();
				StringBuilder st = new StringBuilder();

				while (reader.ready()) {
					st.append(reader.readLine());
					Message message = new Message(c.getId(), st.toString());
					Iterator<Client> it = clients.iterator();
					
						while (it.hasNext()) {
							it.next().addMessage(message);

						}

				}

			} catch (InterruptedException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pool.execute(this);

		}

	}

	private static class Sender implements Runnable {

		@Override
		public void run() {
			try {
				Client c = clients.take();
				clients.add(c);
				c.sendMessage();

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pool.execute(this);

		}

	}

}
