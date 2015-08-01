package ba.bitcamp.week11day05.vjezbe;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.Socket;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClientGUI extends JFrame {

	private static final long serialVersionUID = 7478196867372063864L;

	private Socket socket;

	private JPanel p1 = new JPanel();
	private JLabel[][] fields = new JLabel[10][10];
	private int x = 5;
	private int y = 5;

	public ClientGUI(Socket socket) {
		this.socket = socket;

		add(p1);
		addKeyListener(new Key());
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

		setTitle("[Client] GUI");
		setSize(800, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	private class Key implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {

		}

		@Override
		public void keyPressed(KeyEvent e) {

		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			if (e.getKeyCode() == KeyEvent.VK_W) {
				try {
					fields[x][y].setBackground(Color.CYAN);
					x--;
					Client.sendToServer("W");
					fields[x][y].setBackground(Color.GREEN);
				} catch (IndexOutOfBoundsException ex) {
					x++;
					fields[x][y].setBackground(Color.GREEN);
				}

			}
			if (e.getKeyCode() == KeyEvent.VK_S) {
				try {
					fields[x][y].setBackground(Color.CYAN);
					x++;
					Client.sendToServer("S");
					fields[x][y].setBackground(Color.GREEN);
				} catch (IndexOutOfBoundsException ex) {
					x--;
					fields[x][y].setBackground(Color.GREEN);
				}

			}
			if (e.getKeyCode() == KeyEvent.VK_A) {
				try {
					fields[x][y].setBackground(Color.CYAN);
					y--;
					Client.sendToServer("A");
					fields[x][y].setBackground(Color.GREEN);
				} catch (IndexOutOfBoundsException ex) {
					y++;
					fields[x][y].setBackground(Color.GREEN);

				}

			}
			if (e.getKeyCode() == KeyEvent.VK_D) {
				try {
					fields[x][y].setBackground(Color.CYAN);
					y++;
					Client.sendToServer("D");
					fields[x][y].setBackground(Color.GREEN);
				} catch (IndexOutOfBoundsException ex) {
					y--;
					fields[x][y].setBackground(Color.GREEN);
				}

			}

		}

	}

}