package ba.bitcamp.week6.day3.predavanja;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloWorldGUI2 {

	private static class HelloWorldDisplay extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("Hello World!", 20, 30);
		}
	}
	

	private static class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		
		}
	}
	
	private static class ButtonHandler2 implements ActionListener {
		
		JButton button;
		
		public ButtonHandler2(JButton button){
			super();
			this.button = button;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			String buttonText = button.getText();
			if(buttonText.equals("X")){
				buttonText = "O";
			}else{
				buttonText = "X";
			}
			button.setText(buttonText);
			
		}
		
	}

	public static void main(String[] args) {

		HelloWorldDisplay displayPanel = new HelloWorldDisplay();
		JButton okButton = new JButton("X");
		ButtonHandler2 listener = new ButtonHandler2(okButton);
		okButton.addActionListener(listener);
		
		

		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());
		content.add(displayPanel, BorderLayout.CENTER);
		content.add(okButton, BorderLayout.SOUTH);
		
		JFrame window = new JFrame("GUI Test");
		window.setContentPane(content);
		window.setSize(250, 100);
		window.setLocation(100, 100);
		window.setVisible(true);
		
		
	}

}
