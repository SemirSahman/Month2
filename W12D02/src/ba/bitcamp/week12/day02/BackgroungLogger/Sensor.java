package ba.bitcamp.week12.day02.BackgroungLogger;

import java.io.IOException;
import java.net.Socket;

public class Sensor {
	
	

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("10.0.82.44", 1946);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
