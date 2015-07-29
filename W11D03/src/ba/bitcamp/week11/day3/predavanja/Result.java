package ba.bitcamp.week11.day3.predavanja;

import java.io.BufferedWriter;
import java.io.IOException;

public class Result {

	public static void OK(BufferedWriter bw, String content) throws IOException {

		response(bw, "200 OK", content);
	}

	public static void notFound(BufferedWriter bw) throws IOException {

		response(bw, "404 Not Found", "Not Found");

	}

	public static void serverError(BufferedWriter bw) throws IOException {

		response(bw, "500 Internal Server Error", "Something went wrong");

	}

	public static void response(BufferedWriter bw, String responseCode,
			String responseContent) throws IOException {

		bw.write(String.format("HTTP/1.1 %s \n", responseCode));
		bw.write("content-type: text/html\n");
		bw.newLine();
		bw.write(responseContent);
		bw.flush();

	}
}
