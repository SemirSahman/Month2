package ba.bitcamp.week12.day04.vjezbe;

import java.io.BufferedReader;

import java.io.BufferedWriter;

import java.io.IOException;

import java.io.InputStreamReader;

import java.io.OutputStreamWriter;

import java.math.BigInteger;

import java.net.Socket;

import java.net.UnknownHostException;

public class Client {

	public static String findPrimeNums(BigInteger number, BigInteger start,
			BigInteger end) {

		String result = null;

		BigInteger a;

		BigInteger remainder;

		BigInteger i = start;

		while (i.compareTo(end) <= 0) {

			System.out.println(i);

			remainder = number.remainder(i);

			if (remainder.equals(new BigInteger("0"))) {

				a = number.divide(i);

				result = a + " " + i;

				break;

			}

			// }

			i = i.add(new BigInteger("2"));

		}

		return result;

	}

	public static void main(String[] args) {

		Socket client;

		try {

			while (true) {

				client = new Socket("10.0.82.36", 8000);

				BufferedReader reader = new BufferedReader(

				new InputStreamReader(client.getInputStream()));

				String[] message = reader.readLine().split(" ");

				BigInteger start = new BigInteger(message[0]);

				BigInteger end = new BigInteger(message[1]);

				BigInteger number = new BigInteger(message[2]);

				BufferedWriter writer = new BufferedWriter(

				new OutputStreamWriter(client.getOutputStream()));

				try {
					writer.write(findPrimeNums(number, start, end));

					writer.newLine();

					writer.flush();

				} catch (NullPointerException e) {

				}

			}

		} catch (UnknownHostException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}