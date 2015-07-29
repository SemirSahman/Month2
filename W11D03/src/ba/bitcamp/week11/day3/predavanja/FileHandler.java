package ba.bitcamp.week11.day3.predavanja;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {

	private static final String PATH_TO_PUBLIC = "./public";

	public static String getContent(String route) {
		String fullPath = routeBuilder(route);
		StringBuilder sb = new StringBuilder();
		String s = null;

		File f = new File(fullPath);

		try {
			BufferedReader reader = new BufferedReader(new FileReader(fullPath));

			try {
				while ((s = reader.readLine()) != null) {
					sb.append(s);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found !");
			e.printStackTrace();
		}

		return sb.toString();

	}

	private static String routeBuilder(String route) {
		if (route.equals("/")) {
			route = "/index.html";
		}
		return PATH_TO_PUBLIC + route;
	}

}
