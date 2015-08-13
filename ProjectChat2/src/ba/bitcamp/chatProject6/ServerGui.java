package ba.bitcamp.chatProject6;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ServerGui extends JFrame {
	private static final long serialVersionUID = -1333153852418162002L;

	private JPanel groupPanel = new JPanel();
	private JPanel selfPanel = new JPanel();
	
	private JPanel groupCenterPanel = new JPanel();
	private JPanel groupNorthPanel = new JPanel();
	private JLabel groupPortNumberLabel = new JLabel("Group Port Number");
	private JTextField groupPortField = new JTextField(5);
    String startStop = "Start";
	private JButton groupStart = new JButton(startStop);
	private JPanel groupPanelChatRoom = new JPanel();
	private JPanel groupPanelEventsLogin = new JPanel();
	private JTextArea groupAreaChatRoom = new JTextArea("Chat Room. ");
	private JTextArea groupAreaEventsLogin = new JTextArea("Events login: ");
	private JScrollPane groupScrollChatRoum = new JScrollPane(groupAreaChatRoom);
	private JScrollPane groupScrollEventsLogin = new JScrollPane(groupAreaEventsLogin);
	
	
	
	private JPanel selfCenterPanel = new JPanel();
	private JPanel selfNorthPanel = new JPanel();
	private JLabel selfPortNumberLabel = new JLabel("Port Number");
	private JTextField selfPortField = new JTextField(5);
	private JButton selfStart = new JButton("START");
	private JPanel selfPanelChatRoom = new JPanel();
	private JPanel selfPanelEventsLogin = new JPanel();
	private JTextArea selfAreaChatRoom = new JTextArea("Chat Room. ");
	private JTextArea selfAreaEventsLogin = new JTextArea("Events login: ");
	private JScrollPane selfScrollChatRoum = new JScrollPane(selfAreaChatRoom);
	private JScrollPane selfScrollEventsLogin = new JScrollPane(selfAreaEventsLogin);



	public ServerGui(){
		setLayout(new GridLayout(1, 2));
		add(groupPanel);
		add(selfPanel);
		
		groupPanel.setBorder(BorderFactory.createTitledBorder(""));
		selfPanel.setBorder(BorderFactory.createTitledBorder(""));
		
		groupPanel.setLayout(new BorderLayout());
		groupPanel.add(groupCenterPanel, BorderLayout.CENTER);
		groupPanel.add(groupNorthPanel, BorderLayout.NORTH);
		
		groupCenterPanel.setLayout(new GridLayout(2,1));
		groupCenterPanel.add(groupPanelChatRoom);
		groupCenterPanel.add(groupPanelEventsLogin);
		groupPanelChatRoom.setLayout(new BorderLayout());
		groupPanelChatRoom.add(groupScrollChatRoum, BorderLayout.CENTER);
		groupPanelEventsLogin.setLayout(new BorderLayout());
		groupPanelEventsLogin.add(groupScrollEventsLogin, BorderLayout.CENTER);

		groupNorthPanel.setLayout(new FlowLayout());
		groupNorthPanel.add(groupPortNumberLabel);
		groupNorthPanel.add(groupPortField);
		groupNorthPanel.add(groupStart);
		
		
		selfPanel.setLayout(new BorderLayout());
		selfPanel.add(selfCenterPanel, BorderLayout.CENTER);
		selfPanel.add(selfNorthPanel, BorderLayout.NORTH);
		
		selfCenterPanel.setLayout(new GridLayout(2,1));
		selfCenterPanel.add(selfPanelChatRoom);
		selfCenterPanel.add(selfPanelEventsLogin);
		selfPanelChatRoom.setLayout(new BorderLayout());
		selfPanelChatRoom.add(selfScrollChatRoum, BorderLayout.CENTER);
		selfPanelEventsLogin.setLayout(new BorderLayout());
		selfPanelEventsLogin.add(selfScrollEventsLogin, BorderLayout.CENTER);
		
		selfNorthPanel.setLayout(new FlowLayout());
		selfNorthPanel.add(selfPortNumberLabel);
		selfNorthPanel.add(selfPortField);
		selfNorthPanel.add(selfStart);
		
		
		
		
		setTitle("Server Chat GROUP --- SELF");
		setSize(660, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == groupStart){
				startStop = "Stop";
			}
		}
		
	}
	
}
