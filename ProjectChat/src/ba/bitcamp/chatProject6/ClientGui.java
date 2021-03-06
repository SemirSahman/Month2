package ba.bitcamp.chatProject6;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientGui extends JFrame {

	private static final long serialVersionUID = -24551515424425778L;

	private JPanel groupPanel = new JPanel();
	private JPanel selfPanel = new JPanel();
	private JPanel groupSouthPanel = new JPanel();
	private JPanel groupButtonPanel = new JPanel();
	private JPanel groupFieldPanel = new JPanel();
	private JPanel groupNorthPanel = new JPanel();
	private JTextField groupField = new JTextField();
	private JButton groupSend = new JButton("SEND");
	private JButton groupLogin = new JButton("Login");
	private JButton groupLogaut = new JButton("Logaut");
	private JButton groupWhoIsIn = new JButton("Who is in");
	private JLabel groupPortNumber = new JLabel("Group Port Number: ");
	private JLabel groupServerAddresss = new JLabel("Group Server Address: ");
	private JLabel groupUsername = new JLabel("Username: ");
	private JTextField groupPortNumberField = new JTextField("Enter Port Number");
	private JTextField groupServerAddressField = new JTextField("Enter Server Address");
	private JTextField groupUsernameField = new JTextField("Enter Username");
	private JTextArea groupArea = new JTextArea();

	private JPanel selfSouthPanel = new JPanel();
	private JPanel selfButtonPanel = new JPanel();
	private JPanel selfFieldPanel = new JPanel();
	private JPanel selfNorthPanel = new JPanel();
	private JTextField selfField = new JTextField();
	private JButton selfSend = new JButton("SEND");
	private JButton selfLogin = new JButton("Login");
	private JButton selfLogaut = new JButton("Logaut");
	private JButton selfOpenlist = new JButton("Open List");
	private JLabel selfPortNumber = new JLabel("Port Number: ");
	private JLabel selfServerAddresss = new JLabel("Server Address: ");
	private JLabel selfUsername = new JLabel("Username: ");
	private JTextField selfPortNumberField = new JTextField("Enter Port Number");
	private JTextField selfServerAddressField = new JTextField("Enter Server Address");
	private JTextField selfUsernameField = new JTextField("Enter Username");
	private JTextArea selfArea = new JTextArea();

	public ClientGui() {
		setLayout(new GridLayout(1, 2));
		add(groupPanel);
		add(selfPanel);

		groupPanel.setBorder(BorderFactory.createTitledBorder(""));
		selfPanel.setBorder(BorderFactory.createTitledBorder(""));

		groupPanel.setLayout(new BorderLayout());
		groupPanel.add(groupSouthPanel, BorderLayout.SOUTH);
		groupPanel.add(groupArea, BorderLayout.CENTER);
		groupPanel.add(groupNorthPanel, BorderLayout.NORTH);

		groupNorthPanel.setLayout(new GridLayout(3, 2));
		groupNorthPanel.add(groupServerAddresss);
		groupNorthPanel.add(groupServerAddressField);
		groupNorthPanel.add(groupPortNumber);
		groupNorthPanel.add(groupPortNumberField);
		groupNorthPanel.add(groupUsername);
		groupNorthPanel.add(groupUsernameField);

		groupSouthPanel.setLayout(new GridLayout(2, 1));
		groupSouthPanel.add(groupButtonPanel);
		groupSouthPanel.add(groupFieldPanel);

		groupButtonPanel.setLayout(new FlowLayout());
		groupButtonPanel.add(groupLogin);
		groupButtonPanel.add(groupLogaut);
		groupButtonPanel.add(groupWhoIsIn);

		groupFieldPanel.setLayout(new BorderLayout());
		groupFieldPanel.add(groupSend, BorderLayout.EAST);
		groupFieldPanel.add(groupField, BorderLayout.CENTER);
		groupField.setFocusable(true);

		selfPanel.setLayout(new BorderLayout());
		selfPanel.add(selfSouthPanel, BorderLayout.SOUTH);
		selfPanel.add(selfArea, BorderLayout.CENTER);
		selfPanel.add(selfNorthPanel, BorderLayout.NORTH);

		selfNorthPanel.setLayout(new GridLayout(3, 2));
		selfNorthPanel.add(selfServerAddresss);
		selfNorthPanel.add(selfServerAddressField);
		selfNorthPanel.add(selfPortNumber);
		selfNorthPanel.add(selfPortNumberField);
		selfNorthPanel.add(selfUsername);
		selfNorthPanel.add(selfUsernameField);

		selfSouthPanel.setLayout(new GridLayout(2, 1));
		selfSouthPanel.add(selfButtonPanel);
		selfSouthPanel.add(selfFieldPanel);

		selfButtonPanel.setLayout(new FlowLayout());
		selfButtonPanel.add(selfLogin);
		selfButtonPanel.add(selfLogaut);
		selfButtonPanel.add(selfOpenlist);

		selfFieldPanel.setLayout(new BorderLayout());
		selfFieldPanel.add(selfSend, BorderLayout.EAST);
		selfFieldPanel.add(selfField, BorderLayout.CENTER);
		selfField.setFocusable(true);

		setTitle("Client Chat:  Group --- Self");
		setSize(700, 480);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
		}

		

	}

	public static void main(String[] args) {
		new ClientGui();
	}

}