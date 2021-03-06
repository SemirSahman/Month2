package ba.bitcamp.chatProject7;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Server extends JFrame {

	private static final long serialVersionUID = 3768157397714472954L;

	private JTextField userText;
	private JTextArea chatWindow;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private ServerSocket server;
	private Socket connection;

	public Server() {
		super("Chat Server");
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
		add(new JScrollPane(chatWindow));
		setSize(300, 150);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void startRunning() {

		try {
			server = new ServerSocket(1946, 100);
			while (true) {
				try {
					waitForConnection();
					setupStreams();
					whileChatting();
				} catch (Exception e) {
					System.out.println("Server ended the connection!");
					closeServer();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void waitForConnection() {
		showMessage("Waiting for client to connect ... \n");
		try {
			connection = server.accept();
			showMessage("Connected to: "
					+ connection.getInetAddress().getHostAddress());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void setupStreams() {
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
		String message = "You are now connected";
		sendMessage(message);
		ableToType(true);
		do {
			try {
				message = (String) input.readObject();
				showMessage("\n" + message);
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (!message.equals("CLIENT -- END"));
	}

	private void closeServer() {
		showMessage("\n Closing connections... \n");
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
			output.writeObject("SERVER -- " + message);
			output.flush();
			showMessage("\nSERVER -- " + message);
		} catch (IOException e) {
			chatWindow.append("Cant send that message");
		}
	}

	private void showMessage(final String text) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				chatWindow.append(text);
			}
		});
	}

	private void ableToType(final boolean isAble) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				userText.setEditable(isAble);
			}
		});

	}

}
