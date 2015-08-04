package ba.bitcamp.week12.day02.BackgroungLogger;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		ServerSocket server;
		try {
			server = new ServerSocket(1946);
			
			Socket client = server.accept();

			FileOutputStream fileOutput = new FileOutputStream(
					"/Users/semir.sahman/Desktop/logger.txt");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
