package ba.bitcamp.week6.day3.vjezbe;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Task3 extends JFrame {

	private JLabel label = new JLabel("Press one to disable the other ...");
	private JButton button1 = new JButton("Button1");
	private JButton button2 = new JButton("Button2");
	private int counter = 0;

	public Task3() {

		setLayout(new BorderLayout());
		add(button1, BorderLayout.NORTH);
		add(button2, BorderLayout.SOUTH);
		add(label, BorderLayout.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		button2.addActionListener(new Action());
		button1.addActionListener(new Action());

		Font f = new Font("Comic Sans MS", Font.BOLD, 18);
		Font f2 = new Font("Stencil", Font.BOLD, 18);
		button1.setFont(f);
		button2.setFont(f);
		label.setFont(f2);

		setSize(400, 300);
		setTitle("Task2");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Task3();
	}

	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button1) {
				button1.setEnabled(false);
				button2.setEnabled(true);
				counter++;
				if (counter == 5) {
					System.exit(0);
				}
			} else if (e.getSource() == button2) {
				button2.setEnabled(false);
				button1.setEnabled(true);
				counter++;
				if (counter == 5) {
					System.exit(0);
				}
			}

		}

	}

}
