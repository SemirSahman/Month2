package ba.bitcamp.week11.day3.vjezbe;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ServerHTTP {

	public static void main(String[] args) {

		ServerSocket server;

		try {

			server = new ServerSocket(5555);

			Set<String> ipSet = new TreeSet<>();

			BufferedReader ipReader = new BufferedReader(new FileReader(

			"src/ips.txt"));

			while (true) {

				Socket client = server.accept();

				while (ipReader.ready()) {

					ipSet.add(ipReader.readLine());

				}

				BufferedWriter writer = new BufferedWriter(

				new OutputStreamWriter(client.getOutputStream()));

				BufferedReader reader = new BufferedReader(

				new InputStreamReader(client.getInputStream()));

				BufferedReader fileReader = null;

				String htmlDoc = "";

				boolean printIps = true;

				if (printIps) {

					Iterator<String> it = ipSet.iterator();

					while (it.hasNext()) {

						htmlDoc += it.next();

					}

				}

				writer.write(htmlDoc);
				writer.newLine();
				writer.flush();
				writer.close();

				client.close();

			}

		} catch (IOException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}

}
