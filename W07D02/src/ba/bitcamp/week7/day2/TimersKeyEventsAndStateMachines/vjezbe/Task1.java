package ba.bitcamp.week7.day2.TimersKeyEventsAndStateMachines.vjezbe;

import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task1 extends JFrame {

	private static final long serialVersionUID = -8757555552098835264L;
	
private JLabel label = new JLabel("Focused");
	
	public Task1() {
		add(label);
		label.setFont(new Font("Sans Serif", Font.PLAIN, 35));
		label.setHorizontalAlignment(JLabel.CENTER);
		
		addFocusListener(new Focus());
		
		setTitle("Task1");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private class Focus implements FocusListener {

		@Override
		public void focusGained(FocusEvent e) {
			label.setText("In Focus!");
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			label.setText("Not in Focus !");
			
		}
		
	}

	public static void main(String[] args) {
		new Task1();

	}

}
