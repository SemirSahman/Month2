package ba.bitcamp.week11day05.vjezbe;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ServerGUI extends JFrame {

	private static final long serialVersionUID = 8773586493267481321L;

	private JPanel p1 = new JPanel();
	private static JLabel[][] fields = new JLabel[10][10];
	private static int x = 5;
	private static int y = 5;

	public ServerGUI() {

		add(p1);
		p1.setLayout(new GridLayout(10, 10));
		p1.setBorder(BorderFactory.createTitledBorder("Panel 1"));
		p1.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		for (int i = 0; i < fields.length; i++) {
			for (int j = 0; j < fields[i].length; j++) {
				fields[i][j] = new JLabel();
				fields[i][j].setBackground(Color.CYAN);
				fields[i][j].setOpaque(true);
				fields[i][j].setPreferredSize(new Dimension(10, 10));
				p1.add(fields[i][j]);
			}

		}

		fields[x][y].setBackground(Color.GREEN);
		fields[x][y].setOpaque(true);

		setTitle("[Server] GUI");
		setSize(800, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public void moveRect(String s) {
		if (s.equals("W")) {
			try {
				fields[x][y].setBackground(Color.CYAN);
				x--;
				fields[x][y].setBackground(Color.GREEN);
			} catch (IndexOutOfBoundsException ex) {
				x++;
				fields[x][y].setBackground(Color.GREEN);
			}
		} else if (s.equals("S")) {
			try {
				fields[x][y].setBackground(Color.CYAN);
				x++;
				fields[x][y].setBackground(Color.GREEN);
			} catch (IndexOutOfBoundsException ex) {
				x--;
				fields[x][y].setBackground(Color.GREEN);
			}
		} else if (s.equals("A")) {
			try {
				fields[x][y].setBackground(Color.CYAN);
				y--;
				fields[x][y].setBackground(Color.GREEN);
			} catch (IndexOutOfBoundsException ex) {
				y++;
				fields[x][y].setBackground(Color.GREEN);

			}
		} else if (s.equals("D")) {
			try {
				fields[x][y].setBackground(Color.CYAN);
				y++;
				fields[x][y].setBackground(Color.GREEN);
			} catch (IndexOutOfBoundsException ex) {
				y--;
				fields[x][y].setBackground(Color.GREEN);
			}
		}
	}

}
