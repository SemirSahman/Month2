package ba.bitcamp.week7.day2.TimersKeyEventsAndStateMachines.vjezbe;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Task6 extends JFrame {

	private static final long serialVersionUID = 7846851375170421023L;

	private MyPanel panel = new MyPanel();
	private int size = 60;
	private int x = 370;
	private int y = 320;
 	private int deltaX = 10;
	private double deltay = 4;
	private double slowy = -0.1;
	private Timer t1;
	
	public Task6() {
 		add(panel);

		setTitle("Timers example");
		setSize(800, 400);
		setLocationRelativeTo(null);
		addKeyListener(new KL());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}

	private class MyPanel extends JPanel {
		private static final long serialVersionUID = 8281156269736697513L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			int red = (int) (Math.random() * 256);
			int green = (int) (Math.random() * 256);
			int blue = (int) (Math.random() * 256);

			g.setColor(new Color(red, green, blue));
			g.fillRect(x, y, size, size);
		}
	}


	
	public class KL implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyPressed(KeyEvent e) {

			if (e.getKeyCode()==KeyEvent.VK_SPACE){
				t1 = new Timer(24, new ActionListener() {
 					
					@Override
					public void actionPerformed(ActionEvent e) {
						y -= deltay;
						deltay += slowy;
						panel.repaint();
					}
				});
				t1.start();
			}
			
			
			
			
			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				if (x <= 0) {
 					x = 0;
				} else {
					x -= 10;
				}

			} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				if (x + size >= panel.getWidth()) {
					x = panel.getWidth() - size;
				} else {
					x += 10;
				}
			} else if (e.getKeyCode() == KeyEvent.VK_UP) {
				if (y <= 0) {
 					y = 0;
				} else {
					y -= 10;
				}
			} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {

				if (y + size >= panel.getHeight()) {
					y = panel.getHeight() - size;
				} else {
					y += 10;
				}
			}
			repaint();
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}

	}

	public static void main(String[] args) {
		new Task6();

	}

}