package ba.bitcamp.week7.day2.TimersKeyEventsAndStateMachines.predavanje;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Seconds extends JFrame {

	private int second = 0;
	Font f1 = new Font("Serif", Font.BOLD, 24);
	JLabel l1 = new JLabel();
	
	public Seconds(){
		add(l1);
		l1.addMouseListener(new Mouse());
		l1.setFont(f1);
		l1.setHorizontalAlignment(JLabel.CENTER);
		l1.setText(Integer.toString(second));
		setSize(500,500);
		setLocation(500, 350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private class Mouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			if(e.getSource() == l1){
				second++;
				l1.setText("" + second);
			}
			
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
		new Seconds();

	}

}