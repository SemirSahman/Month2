package ba.bitcamp.chatProject4;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

import ba.bitcamp.chatProject.Client;
import ba.bitcamp.chatProject.Message;


public class Server implements Runnable {

	private int serverPort = 1946;
	private ServerSocket serverSocket = null;
	private boolean isStopped = false;
	private Thread runningThread = null;
	private static ExecutorService threadPool = Executors
			.newFixedThreadPool(10);
	public static LinkedBlockingQueue<Client> clients;
	private static LinkedBlockingQueue<Message> messages;
	private Object lock = new Object();

	public Server(int port) {
		this.serverPort = port;
	}

	public void run() {
		synchronized (lock) {
			this.runningThread = Thread.currentThread();
		}
		openServerSocket();
		while (!isStopped()) {
			Socket clientSocket = null;
			try {
				clientSocket = this.serverSocket.accept();
				clients.add(new Client(clientSocket));
				System.out.println(clientSocket.getInetAddress()
						.getHostAddress() + " connected");
			} catch (IOException e) {
				if (isStopped()) {
					System.out.println("Server Stopped.");
					break;
				}
			}
			this.threadPool.execute(new WorkerThreads(clientSocket,
					"Chat Server"));
		}
		this.threadPool.shutdown();
		System.out.println("Server Stopped.");
	}

	private synchronized boolean isStopped() {
		return this.isStopped;
	}

	public synchronized void stop() {
		this.isStopped = true;
		try {
			this.serverSocket.close();
		} catch (IOException e) {
			throw new RuntimeException("Error closing server", e);
		}
	}

	private void openServerSocket() {
		try {
			this.serverSocket = new ServerSocket(this.serverPort);
		} catch (IOException e) {
			throw new RuntimeException("Cannot open port 8080", e);
		}
	}

	private static class WorkerThreads implements Runnable {

		private Socket clientSocket = null;
		private String serverText = null;

		public WorkerThreads(Socket clientSocket, String serverText) {
			this.clientSocket = clientSocket;
			this.serverText = serverText;
		}

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
					synchronized (clients) {
						while (it.hasNext()) {
							System.out.println(message);
							Client client = it.next();
							client.addMessage(message);
						}
					}
					System.out.println(clients.size());
					System.out.println();
				}

				// InputStream input = clientSocket.getInputStream();
				// OutputStream output = clientSocket.getOutputStream();
				// long time = System.currentTimeMillis();
				// output.write(("HTTP/1.1 200 OK\n\nWorkerThreads: "
				// + this.serverText + " - " + time + "").getBytes());
				// output.close();
				// input.close();
				// System.out.println("Request processed: " + time);
			} catch (IOException | InterruptedException e) {
				// report exception somewhere.
				e.printStackTrace();
			}
		}
	}

	private static class Sender implements Runnable {

		@Override
		public void run() {
			try {
				Client c = clients.take();
				clients.add(c);
				c.sendMessages();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			threadPool.execute(this);
		}
	}

	 public static void main(String[] args) {
		 clients = new LinkedBlockingQueue<Client>();
			messages = new LinkedBlockingQueue<Message>();
//			threadPool.submit(new WorkerThreads(null, null));
//			threadPool.submit(new Listener());
//			threadPool.submit(new Listener());
//			threadPool.submit(new Listener());
//			threadPool.submit(new Listener());
			threadPool.submit(new Sender());
			threadPool.submit(new Sender());
			threadPool.submit(new Sender());
	 Server server = new Server(1946);
	 new Thread(server).start();
	
	 try {
	 Thread.sleep(10);
	 } catch (InterruptedException e) {
	 e.printStackTrace();
	 }
	 System.out.println("Stopping Server");
	 server.stop();
	 }
}
