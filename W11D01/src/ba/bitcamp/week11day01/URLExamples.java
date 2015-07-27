package ba.bitcamp.week11day01;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class URLExamples {

	public static void main(String[] args) {

		URL url1 = null;

		try {
			url1 = new URL(
					"http://znamo.ba/wp-content/uploads/2015/05/Sarajevo-sampion2015.jpg");
		} catch (MalformedURLException e) {
			System.out.println("Bad URL");
			e.printStackTrace();
			System.exit(1);
		}

		ImageIcon imageIcon = new ImageIcon(url1);
		JFrame frame = new JFrame();
		frame.setSize(800, 800);
		frame.add(new JLabel(imageIcon));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		try {
			BufferedImage image = ImageIO.read(url1);
		} catch (IOException e) {
			System.out.println("IOException");
			e.printStackTrace();
		}

		try {
			URLConnection con = url1.openConnection();
			System.out.println(con.getContent());
			InputStream in = con.getInputStream();

			File file = new File("output.jpg");
			FileOutputStream fileWrite = new FileOutputStream(file);

			byte[] data = new byte[1024];
			int bytesRead;

			while ((bytesRead = in.read(data, 0, 1024)) > 0){
				fileWrite.write(data, 0, bytesRead);
			}
			
			fileWrite.close();
				

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
