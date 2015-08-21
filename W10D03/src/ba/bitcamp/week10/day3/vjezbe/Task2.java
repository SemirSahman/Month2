package ba.bitcamp.week10.day3.vjezbe;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Task2 {

	public static void main(String[] args) {

		int counter = 0;
		int counter0 = 0;
		int counter1 = 0;
		int counter2 = 0;
		int counter3 = 0;
		int counter4 = 0;
		int counter5 = 0;
		int counter6 = 0;
		int counter7 = 0;
		int counter8 = 0;
		int counter9 = 0;

		BufferedReader in = null;

		try {
			in = new BufferedReader(new FileReader(new File("src/poker.txt")));
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find file!");
		}

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		JFileChooser open = new JFileChooser();

		int action = open.showOpenDialog(null);

		if (action == JFileChooser.APPROVE_OPTION) {

			try {
				in.readLine();
				while (in.ready()) {
					String line = in.readLine();
					//StringTokenizer st = new StringTokenizer(line, ",");

					counter++;

					char c = line.charAt(line.length() - 1);

					if (c == '0') {
						counter0++;
					} else if (c == '1') {
						counter1++;
					} else if (c == '2') {
						counter2++;
					} else if (c == '3') {
						counter3++;
					} else if (c == '4') {
						counter4++;
					} else if (c == '5') {
						counter5++;
					} else if (c == '6') {
						counter6++;
					} else if (c == '7') {
						counter7++;
					} else if (c == '8') {
						counter8++;
					} else if (c == '9') {
						counter9++;
					}

				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else if (action == JFileChooser.CANCEL_OPTION) {
			System.out.println("You canceled!");
		}

		System.out.println("Number of hands: " + counter);
		System.out.println("Nothing in hand: " + counter0 + " Percentage: "
				+ (double) ((double) counter0 / counter) * 100 + "%");
		System.out.println("One pair: " + counter1 + " Percentage: "
				+ (double) ((double) counter1 / counter) * 100 + "%");
		System.out.println("Two pairs: " + counter2 + " Percentage: "
				+ (double) ((double) counter2 / counter) * 100 + "%");
		System.out.println("Three of a kind: " + counter3 + " Percentage: "
				+ (double) ((double) counter3 / counter) * 100 + "%");
		System.out.println("Straight: " + counter4 + " Percentage: "
				+ (double) ((double) counter4 / counter) * 100 + "%");
		System.out.println("Flush: " + counter5 + " Percentage: "
				+ (double) ((double) counter5 / counter) * 100 + "%");
		System.out.println("Full house: " + counter6 + " Percentage: "
				+ (double) ((double) counter6 / counter) * 100 + "%");
		System.out.println("Four of a kind: " + counter7 + " Percentage: "
				+ (double) ((double) counter7 / counter) * 100 + "%");
		System.out.println("Straight flush: " + counter8 + " Percentage: "
				+ (double) ((double) counter8 / counter) * 100 + "%");
		System.out.println("Royal flush: " + counter9 + " Percentage: "
				+ (double) ((double) counter9 / counter) * 100 + "%");

	}

}
