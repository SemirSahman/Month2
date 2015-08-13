package ba.bitcamp.chatProject7;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Client extends JFrame {

	private static final long serialVersionUID = -3647972826372290492L;

	private JTextField userText;
	private JTextArea chatWindow;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private String message = "";
	private String serverIP;
	private Socket connection;

	public Client(String host) {
		super("Chat Client");
		serverIP = host;
		userText = new JTextField();
		userText.setEditable(false);
		userText.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sendMessage(e.getActionCommand());
				userText.setText("");

			}
		});
		add(userText, BorderLayout.NORTH);
		chatWindow = new JTextArea();
		add(new JScrollPane(chatWindow), BorderLayout.CENTER);
		setSize(300, 150);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void startRunning() {
		try {
			connectToServer();
			setupStreams();
			whileChatting();
		} catch (Exception e) {
			closeServer();
		}
	}

	private void connectToServer() {
		showMessage("Attempting connection... \n");
		try {
			connection = new Socket(InetAddress.getByName(serverIP), 1946);
			showMessage("Connected to: "
					+ connection.getInetAddress().getHostAddress());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void setupStreams() {
		try {
			output = new ObjectOutputStream(connection.getOutputStream());
			output.flush();
			input = new ObjectInputStream(connection.getInputStream());
			showMessage("\n Streams are setup \n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void whileChatting() {
		ableToType(true);
		do {

			try {
				message = (String) input.readObject();
				showMessage("\n" + message);
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} while (!message.equals("SERVER -- END"));
	}

	private void closeServer() {
		showMessage("\n Closing server...");
		ableToType(false);

		try {
			output.close();
			input.close();
			connection.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void sendMessage(String message) {
		try {
			output.writeObject("CLIENT -- " + message);
			output.flush();
			showMessage("\nCLIENT -- " + message);
		} catch (Exception e) {
			chatWindow.append("\n Cant send message");
		}
	}

	private void showMessage(final String m) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				chatWindow.append(m);

			}
		});
	}

	public void ableToType(final boolean isAble) {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				userText.setEditable(isAble);

			}
		});

	}

}
