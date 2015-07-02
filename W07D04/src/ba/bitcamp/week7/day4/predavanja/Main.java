package ba.bitcamp.week7.day4.predavanja;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		JFrame window = new JFrame("Layouts");
		JPanel container = new JPanel();
		container.setLayout(new FlowLayout(FlowLayout.LEADING, 0,0));
		//container.setLayout(new BorderLayout());
		//container.setLayout(new GridLayout(2,3));
		JButton[] buttons = new JButton[5];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i]=new JButton("Button "+i);
			container.add(buttons[i]);
		}
		
//		container.add(buttons[0], BorderLayout.EAST);
//		container.add(buttons[1], BorderLayout.WEST);
//		container.add(buttons[2], BorderLayout.NORTH);
//		container.add(buttons[3], BorderLayout.SOUTH);
		
		window.add(container);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400, 400);
		window.setVisible(true);

	}

}