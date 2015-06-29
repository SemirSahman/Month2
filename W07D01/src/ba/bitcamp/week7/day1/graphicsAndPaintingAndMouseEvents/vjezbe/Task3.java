package ba.bitcamp.week7.day1.graphicsAndPaintingAndMouseEvents.vjezbe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Task3 extends JFrame {

	private static final long serialVersionUID = -1948646775761648573L;

	Font f = new Font("Serif", Font.BOLD, 50);
	private String s = "Last pressed: ";

	private class MyPanel extends JPanel {
		private static final long serialVersionUID = 4488982013538534508L;
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			Graphics2D g2d = (Graphics2D) g;
			g2d.setColor(Color.CYAN);
			g2d.setFont(f);
			g2d.drawString(s, 200, 200);

		}
	}

	private JPanel panel = new MyPanel();

	public Task3() {

		setLayout(new BorderLayout());
		add(panel);
		panel.addMouseListener(new Mouse());

		setSize(400, 400);
		setLocationRelativeTo(null);
		setTitle("Task3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	private class Mouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getButton() == MouseEvent.BUTTON1) {
				s = "Last pressed: ";
				s += "Left";

			} else if (e.getButton() == MouseEvent.BUTTON2) {
				s = "Last pressed: ";
				s += "Middle";
			} else if (e.getButton() == MouseEvent.BUTTON3) {
				s = "Last pressed: ";
				s += "Right";
			}
			repaint();

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

	}

	public static void main(String[] args) {
		new Task3();

	}

}
