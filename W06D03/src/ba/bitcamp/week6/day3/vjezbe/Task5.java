package ba.bitcamp.week6.day3.vjezbe;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task5 extends JFrame {

	private JButton button1 = new JButton("<");
	private JButton button2 = new JButton("Remove");
	private JButton button3 = new JButton(">");
	String s = "Example Sentence";
	private JLabel label = new JLabel(s);
	private int x = 0;

	public Task5() {

		setLayout(new BorderLayout());
		add(button1, BorderLayout.WEST);
		add(button2, BorderLayout.SOUTH);
		add(button3, BorderLayout.EAST);
		add(label, BorderLayout.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("Courier New", Font.PLAIN, 18));
		button1.addActionListener(new Action());
		button2.addActionListener(new Action());
		button3.addActionListener(new Action());

		setSize(400, 300);
		setTitle("Task5");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task5();

	}

	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				if (e.getSource() == button1) {
					x--;
					label.setText(s.substring(0, x) + "_"
							+ s.substring(x + 1, s.length()));
				} else if (e.getSource() == button3) {
					x++;
					label.setText(s.substring(0, x) + "_"
							+ s.substring(x + 1, s.length()));
				} else if (e.getSource() == button2) {
					s = s.substring(0, x) + s.substring(x + 1, s.length());
					label.setText(s);
				}

			} catch (StringIndexOutOfBoundsException e1) {
				System.out.println("Wrong direction, go other way");
			}

		}
	}
}
