package ba.bitcamp.week8.day3.vjezbe.ArrayProcessing;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class AnArrayOfFonts extends JFrame {

	Font[] fonts = new Font[40];
	JLabel[] label = new JLabel[40];

	public AnArrayOfFonts() {
		setLayout(new GridLayout(40, 1));
		for (int i = 0; i < 40; i++) {
			fonts[i] = new Font("Sans", Font.BOLD, i + 1);
			label[i] = new JLabel("Mase");
			add(label[i]);
			label[i].setFont(fonts[i]);
			label[i].setHorizontalAlignment(label[i].CENTER);
		}
		
		setSize(800,500);
		setTitle("An Array Of Fonts");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public static void main(String[] args) {
		new AnArrayOfFonts();

	}

}
