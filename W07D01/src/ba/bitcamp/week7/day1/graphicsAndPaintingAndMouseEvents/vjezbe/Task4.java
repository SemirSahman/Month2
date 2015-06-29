package ba.bitcamp.week7.day1.graphicsAndPaintingAndMouseEvents.vjezbe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Task4 extends JFrame{

	private static final long serialVersionUID = -506004073766389309L;
	
	private JLabel label = new JLabel("Task4");
	Font f1 = new Font("Serif", Font.PLAIN, 50);
	Font f2 = new Font("Serif", Font.BOLD, 50);
	
	public Task4() {
		setLayout(new BorderLayout());
		add(label);
		
		label.setHorizontalAlignment(JLabel.CENTER);
		label.addMouseListener(new MouseMotion());
		label.setForeground(Color.DARK_GRAY);
		label.setFont(f1);

		setSize(400, 400);
		setLocationRelativeTo(null);
		setTitle("Task1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		
	}
	
	private class MouseMotion implements MouseListener, MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			if(e.getSource() == label){
				label.setFont(f2);
			}
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			if(e.getSource() == label){
				label.setFont(f1);
			}
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			if(e.getSource() == label){
				label.setForeground(Color.CYAN);
			}
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if(e.getSource() == label){
				label.setForeground(Color.DARK_GRAY);
			}
			
		}
		
	}
	
	

	public static void main(String[] args) {
		new Task4();

	}

}
