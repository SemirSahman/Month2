package ba.bitcamp.week12.day05.predavanje;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Task1 {

	static BufferedReader bufferedReader;

	public static void main(String[] args) {
		try {
			bufferedReader = new BufferedReader(
					new InputStreamReader(
							new URL(
									"http://www.klix.ba/vijesti/bih/izetbegovic-nas-najveci-problem-je-dodik/150730099")
									.openConnection().getInputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		StringBuilder sb = new StringBuilder();
		String line = null;
		try {
			while ((line = bufferedReader.readLine()) != null) {
				sb.append(line);
				sb.append("\n");
				System.out.println(line);

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
