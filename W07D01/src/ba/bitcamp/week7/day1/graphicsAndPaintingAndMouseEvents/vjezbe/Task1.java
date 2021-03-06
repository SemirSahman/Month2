package ba.bitcamp.week7.day1.graphicsAndPaintingAndMouseEvents.vjezbe;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task1 extends JFrame {

	private static final long serialVersionUID = -8388386491458700544L;

	private JLabel label = new JLabel("Not clicked ...");
	private Font font1 = new Font("Monospaced", Font.PLAIN, 35);
	private Font font2 = new Font("Monospaced", Font.BOLD, 35);

	public Task1() {
		setLayout(new BorderLayout());
		add(label);

		label.setFont(font1);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.addMouseListener(new MouseMotion());

		setSize(400, 300);
		setLocationRelativeTo(null);
		setTitle("Task1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	private class MouseMotion implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getSource() == label) {
				label.setFont(font2);
				label.setText("It is clicked !");
			}

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

	}

	public static void main(String[] args) {
		new Task1();

	}

}
