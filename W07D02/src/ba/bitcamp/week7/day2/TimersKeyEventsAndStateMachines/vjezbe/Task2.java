package ba.bitcamp.week7.day2.TimersKeyEventsAndStateMachines.vjezbe;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task2 extends JFrame {

	private static final long serialVersionUID = 2237071255449095766L;

	JLabel label = new JLabel();
	private String s = "";

	public Task2() {
		addKeyListener(new Key());
		add(label);
		label.setFont(new Font("Sans Serif", Font.PLAIN, 35));
		label.setHorizontalAlignment(JLabel.CENTER);

		setTitle("Task2");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private class Key implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyPressed(KeyEvent e) {

			if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
				if (s.length() == 0) {
					s = "";
				} else {
					s = s.substring(0, s.length() - 1);
					label.setText(s);
				}
			} else {
				s += e.getKeyChar();
				label.setText(s);
			}

		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}

	}

	public static void main(String[] args) {
		new Task2();

	}

}
