package ba.bitcamp.week7.day1.graphicsAndPaintingAndMouseEvents.vjezbe;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Task5 extends JFrame {

	private static final long serialVersionUID = -5540428152655402782L;

	private JPanel panel = new MyPanel();
	private Color chosenColor = Color.BLACK;
	private boolean action = false;

	public Task5() {

		setLayout(new BorderLayout());
		add(panel);
		panel.addMouseListener(new MouseMotion());

		setTitle("Task5");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	private class MyPanel extends JPanel {
		private static final long serialVersionUID = -6302911398550823044L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;

			g2d.setColor(chosenColor);
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);
			g2d.setStroke(new BasicStroke(10));
			if (action == true) {
				g2d.drawLine(0, 0, panel.getWidth(), panel.getHeight());
				g2d.drawLine(0, panel.getHeight(), panel.getWidth(), 0);
			}
			repaint();
		}
	}

	private class MouseMotion implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub

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
			if (e.getSource() == panel) {
				action = true;
			}

		}

		@Override
		public void mouseExited(MouseEvent e) {
			if (e.getSource() == panel) {
				action = false;
			}

		}

	}

	public static void main(String[] args) {
		new Task5();

	}

}
