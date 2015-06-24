package ba.bitcamp.week6.day3.vjezbe;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Task1 extends JFrame {
	
	private JButton button = new JButton("Hello!");
	private JLabel label = new JLabel("Hello World!");

	public Task1() {
		
		setLayout(new BorderLayout());
		
		add(button, BorderLayout.SOUTH);
		add(label, BorderLayout.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		button.addActionListener(new Action());
		
		setSize(400, 300);
		setTitle("Task1");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task1();
	}
	private class Action implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button){
				JOptionPane.showMessageDialog(null, "Hello!");
				System.exit(0);
			}
			
		}
		
	}

}
