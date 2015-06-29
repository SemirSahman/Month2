package ba.bitcamp.week7.day1.graphicsAndPaintingAndMouseEvents.vjezbe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Task6 extends JFrame {
	
	private static final long serialVersionUID = -9150888675329237137L;
	
	Font f = new Font("Serif", Font.BOLD, 50);
	private String s = "";
			
	private class MyPanel extends JPanel {
		private static final long serialVersionUID = 4488982013538534508L;
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			Graphics2D g2d = (Graphics2D) g;
			g2d.setColor(Color.DARK_GRAY);
			g2d.setFont(f);
			g2d.drawString(s, 300, 300);
		}
	}

	private JPanel panel = new MyPanel();
	
	public Task6() {

		setLayout(new BorderLayout());
		add(panel);
		panel.addMouseMotionListener(new Mouse());

		setSize(800, 800);
		setLocationRelativeTo(null);
		setTitle("Task6");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
	
	private class Mouse implements MouseListener, MouseMotionListener {

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
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			if(e.getSource() == panel){
				s = "X: " + e.getX() + " Y: " + e.getY();
			}
			repaint();
		}
		
	}

	public static void main(String[] args) {
		new Task6();

	}

}
