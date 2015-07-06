package ba.bitcamp.week8.day1.JMenuAndJDialogs;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MiniTextEditor extends JFrame {
	private static final long serialVersionUID = 6868130269770947938L;

	JTextArea textArea = new JTextArea("Sarajevo Sampion");
	private JMenuBar bar = new JMenuBar();
	private JMenu fileMenu = new JMenu("File");
	private JMenu insert = new JMenu("Insert");
	private JMenuItem item1 = new JMenuItem("Insert Text");

	private JTextField index = new JTextField();
	private JTextField dialogText = new JTextField();

	public MiniTextEditor() {

		setJMenuBar(bar);
		bar.add(fileMenu);
		bar.add(insert);
		insert.add(item1);
		item1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new MyDialog();

			}
		});
		add(textArea);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 300);
 		setLocationRelativeTo(null);
		setTitle("Task 2");
		setVisible(true);
	}

	private class MyDialog extends JDialog {
		private static final long serialVersionUID = -4070623060379881616L;

		JButton b1 = new JButton("Insert text");
		String s = "";

		public MyDialog() {
			setLayout(new GridLayout(1, 2));
			add(dialogText);
			add(index);
			add(b1);
			b1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					s = textArea.getText().substring(0,
							Integer.parseInt(index.getText()));

					textArea.setText(s
							+ dialogText.getText()
							+ textArea.getText().substring(
									Integer.parseInt(index.getText()),
									textArea.getText().length()));
 				}
			});
			setModalityType(ModalityType.MODELESS);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setSize(200, 100);
			setLocationRelativeTo(null);
			setTitle("Example JDialog");
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MiniTextEditor();
	}

}