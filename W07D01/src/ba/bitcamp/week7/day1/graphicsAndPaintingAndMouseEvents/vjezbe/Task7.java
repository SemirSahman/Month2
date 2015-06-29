package ba.bitcamp.week7.day1.graphicsAndPaintingAndMouseEvents.vjezbe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Task7 extends JFrame {

	private static final long serialVersionUID = -6076944040593156542L;
	
	private int[] values = {10, 20, 50, 30, 50, 40, 20, 0, 10, 40, 80};
	private int x = 100;
	private int y = 100;
	
	private class MyPanel extends JPanel {
		private static final long serialVersionUID = 4488982013538534508L;
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			Graphics2D g2d = (Graphics2D) g;
			g2d.setColor(Color.DARK_GRAY);
			
			for(int i = 0; i<values.length;i++){
				g2d.fillRect(x, y - values[i], 50, values[i]);
				x+=50;
			}

		}
	}

	private JPanel panel = new MyPanel();
	
	public Task7() {

		setLayout(new BorderLayout());
		add(panel);

		setSize(800, 800);
		setLocationRelativeTo(null);
		setTitle("Task7");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Task7();

	}

}
