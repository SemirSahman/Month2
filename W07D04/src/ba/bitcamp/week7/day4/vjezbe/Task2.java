package ba.bitcamp.week7.day4.vjezbe;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Task2 extends JFrame {

	private static final long serialVersionUID = -867779984217581080L;
	
	JPanel centerPanel = new JPanel();
	JPanel southPanel = new JPanel();
	JLabel label1 = new JLabel("Label 1");
	JLabel label2 = new JLabel("Label 2");
	JLabel label3 = new JLabel("Label 3");
	JLabel label4 = new JLabel("Label 4");
	JLabel label5 = new JLabel("Label 1");
	
	public Task2(){
		setLayout(new BorderLayout());
		
		add(centerPanel, BorderLayout.CENTER);
		centerPanel.setBorder(BorderFactory.createTitledBorder("Center panel"));
		add(southPanel, BorderLayout.SOUTH);
		southPanel.setBorder(BorderFactory.createTitledBorder("South panel"));
		
		centerPanel.setLayout(new GridLayout(4, 2));
		centerPanel.add(label1);
		centerPanel.add(new JButton("Button 1"));
		centerPanel.add(label2);
		centerPanel.add(new JButton("Button 2"));
		centerPanel.add(label3);
		centerPanel.add(new JButton("Button 3"));
		centerPanel.add(label4);
		centerPanel.add(new JButton("Button 4"));
		
		southPanel.add(label5);
		southPanel.add(new JButton("Button 1"));
		
		
		
		setTitle("Frame2");
		setLocationRelativeTo(null);
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new Task2();
	}

}
