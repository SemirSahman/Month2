package ba.bitcamp.week11day2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class SendMessage extends JFrame {

	JTextArea text = new JTextArea();
	JButton button = new JButton("Send");

	public SendMessage() {

		setLayout(new BorderLayout());
		add(text, BorderLayout.CENTER);
		add(button, BorderLayout.SOUTH);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					System.out.println("CLIENT Application started");
					Socket socket = new Socket("10.0.82.113", 7321);
					System.out.println("CLIENT connected to localhost");

					BufferedWriter writer = new BufferedWriter(
							new OutputStreamWriter(socket.getOutputStream()));

					writer.write(text.getText());
					writer.newLine();
					writer.flush();

				} catch (IOException ex) {
					ex.printStackTrace();
				}

			}
		});

		setSize(800, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public static void main(String[] args) {
		
		new SendMessage();

	}

}
