package ba.bitcamp.week7.day4.vjezbe;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Task3 extends JFrame {

	private static final long serialVersionUID = 8087731894511928682L;

	JPanel centerPanel = new JPanel();
	JPanel eastPanel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JLabel label1 = new JLabel("This seems to be Label 1");
	JLabel label2 = new JLabel("This seems to be Label 2");
	JLabel label3 = new JLabel("This seems to be Label 3");
	JTextArea area = new JTextArea();
	
	public Task3(){
		setLayout(new BorderLayout());
		add(centerPanel, BorderLayout.CENTER);
		centerPanel.setBorder(BorderFactory.createTitledBorder("Center panel"));
		add(eastPanel, BorderLayout.EAST);
		eastPanel.setBorder(BorderFactory.createTitledBorder("East panel"));
		
		centerPanel.setLayout(new BorderLayout());
		centerPanel.add(area, BorderLayout.CENTER);
		
		eastPanel.setLayout(new GridLayout(2,1));
		eastPanel.add(panel1);
		panel1.setBorder(BorderFactory.createTitledBorder("Panel 1"));
		eastPanel.add(panel2);
		panel2.setBorder(BorderFactory.createTitledBorder("Panel 2"));
		
		panel1.setLayout(new GridLayout(3,1));
		panel1.add(label1);
		panel1.add(label2);
		panel1.add(label3);
		
		panel2.add(new JButton("Button 1"));
		panel2.add(new JButton("Button 2"));
		
		setTitle("Frame3");
		setLocationRelativeTo(null);
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public static void main(String[] args) {
		new Task3();

	}

}
