package ba.bitcamp.week12.day02;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RenderingAnImage extends JFrame {

	private static final long serialVersionUID = 4809338752402490908L;

	JPanel panel;
	static BufferedImage image = null;

	public RenderingAnImage() {
		try {
			image = ImageIO
					.read(new URL(
							"http://znamo.ba/wp-content/uploads/2015/05/Sarajevo-sampion2015.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		panel = new MyPanel();
		add(panel);

		setTitle("Rendering an image");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1920, 1277);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);

		Thread t = new Thread(new MyThread());
		t.start();
	}

	public class MyPanel extends JPanel {

		private static final long serialVersionUID = -4935293059853791132L;

		@Override
		protected void paintComponent(Graphics g) {

			super.paintComponent(g);
			g.drawImage(image, 0, 0, image.getWidth(), image.getHeight(), null);
		}

	}

	class MyThread implements Runnable {

		@Override
		public void run() {
			for (int i = 0; i < image.getWidth(); i++) {
				for (int j = 0; j < image.getHeight(); j++) {
					int pixel = image.getRGB(i, j);
					image.setRGB(i, j, 255 - pixel);
					repaint();

				}
			}
		}

	}

	public static void main(String[] args) {

		new RenderingAnImage();
	}

}
