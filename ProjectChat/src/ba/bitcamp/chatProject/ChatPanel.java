package ba.bitcamp.chatProject;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatPanel extends JPanel {

	private static final long serialVersionUID = -5533260342842566689L;

	private JTextField text = new JTextField("Enter message");
	private JButton button = new JButton("Send");
	private JTextArea area = new JTextArea();

	private BufferedWriter writer;
	private BufferedReader reader;
	private ExecutorService pool = Executors.newSingleThreadExecutor();
	private Object lock = new Object();

	public ChatPanel() {

		setLayout(new BorderLayout());
		Socket socket = null;
		try {
			socket = new Socket("localhost", 6815);
			writer = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));
			reader = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
		} catch (IOException e3) {
			e3.printStackTrace();
			System.exit(1);
		}

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(1);
				pool.submit(new Runnable() {

					@Override
					public void run() {
						try {
							writer.write(text.getText());
							text.setText("");
							writer.newLine();
							writer.flush();
						} catch (UnknownHostException e1) {
							e1.printStackTrace();
						} catch (IOException e2) {
							e2.printStackTrace();
						}
					}
				});
			}
		});
		area.setEditable(false);
		add(area, BorderLayout.CENTER);
		add(text, BorderLayout.NORTH);
		add(button, BorderLayout.SOUTH);

		new Thread(new Runnable() {

			@Override
			public void run() {
				for (;;) {
					String line;
					try {
						line = reader.readLine();
						System.out.println(line);
						area.append(line + "\n");
					
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
}