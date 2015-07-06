package ba.bitcamp.week8.day1.JMenuAndJDialogs;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CommentsPage extends JFrame {

	private static final long serialVersionUID = -1611277276378344329L;

	private JTextField email = new JTextField(10);

	private JTextField name = new JTextField(10);

	private JTextArea comment = new JTextArea();

	private JButton submit = new JButton("Submit !");

	public CommentsPage() {

		submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (email.getText().contains("@")
						&& email.getText().contains(".com")) {

					JOptionPane.showMessageDialog(null, "Saved !");

				} else

					JOptionPane.showMessageDialog(null, "Error !");

			}

		});

		JLabel label1 = new JLabel();

		label1.setLayout(new GridLayout(2, 1));

		label1.add(email);

		label1.add(name);

		add(label1);

		JLabel label2 = new JLabel();

		label2.setLayout(new BorderLayout());

		label2.add(comment, BorderLayout.CENTER);

		label2.add(submit, BorderLayout.SOUTH);

		add(label2);

		setLayout(new GridLayout(2, 1));

		setLocationRelativeTo(null);

		setSize(800, 600);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);

	}

	public static void main(String[] args) {

		new CommentsPage();

	}

}