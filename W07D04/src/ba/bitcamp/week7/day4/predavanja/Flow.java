package ba.bitcamp.week7.day4.predavanja;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Flow {

	public static void main(String[] args) {
		
		int red;
		int green;
		int blue;
		
		Color c;
		
		JFrame window = new JFrame("Layouts");
		JPanel container = new JPanel();
		container.setLayout(new FlowLayout(FlowLayout.LEADING, 0,0));
		
		JButton[] buttons = new JButton[64];
		for (int i = 0; i < buttons.length; i++) {
			red = (int)(Math.random()*255);
			green = (int)(Math.random()*255);
			blue = (int)(Math.random()*255);
			c = new Color(red, green, blue);
			buttons[i]=new JButton("Button "+i);
			container.add(buttons[i]);
			buttons[i].setPreferredSize(new Dimension(100, 100));
			buttons[i].setBackground(c);
			buttons[i].setOpaque(true);
			//buttons[i].setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
			//buttons[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 5, true));
			//buttons[i].setBorder(BorderFactory.createMatteBorder(5, 5, 10, 10, Color.BLACK));
			//buttons[i].setBorder(BorderFactory.createEtchedBorder());
			if(i%2 == 0)
			buttons[i].setBorder(BorderFactory.createRaisedBevelBorder());
			else
				buttons[i].setBorder(BorderFactory.createLoweredBevelBorder());
		}
		
		window.add(container);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(800, 830);
		window.setVisible(true);
		window.setLocationRelativeTo(null);

	}

}
