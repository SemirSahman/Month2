package ba.bitcamp.week6.day3.vjezbe;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Main extends JFrame{

	private static final long serialVersionUID = 7101439525865316887L;
	private JButton dugme; //= new Action(); moze i ovako
	
	private JLabel text = new JLabel("ovo je tekst");
	private JLabel button1 = new JLabel("Exit");
	private JLabel button2= new JLabel("Left");
	private JLabel button3= new JLabel("Right");
	
	public Main () {
		BorderLayout layout = new BorderLayout();
		
		add(text);
		add(button1, BorderLayout.SOUTH);
		add(button2, BorderLayout.SOUTH);
		add(button3, BorderLayout.SOUTH);
		
		dugme = new JButton("OK");
		Action listen = new Action();
		dugme.addActionListener(listen);
		//dugme.addActionListener(new Action(); najcesce se ovako radi 
		add(dugme);
		
		/*JLabel text = new JLabel("Hello world!");
		text.setText("Evo promijenjen  je tekst.");
		add(text); */
		
		setVisible(true);
		setTitle("Prozor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		//Main prozor = new Main(); a moz ei ovako
		new Main(); //najcesce cemo ovako raditi
	/*	prozor.setVisible(true);
		prozor.setTitle("Prozor");
		prozor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		prozor.setSize(400, 300); */
	
		JOptionPane.showMessageDialog(null, "Hello World!");//ispisuje poruku
		
	/*	JFrame prozor = new JFrame(); //napravi prozor
		prozor.setVisible(true);
		prozor.setTitle("Prozor");
		prozor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		prozor.setSize(400, 300);
		prozor.setLocation(520, 250);
		prozor.setLocationRelativeTo(null); //stavlja prozor na centar
		prozor.setResizable(false); //fiksira velicinu prozora
		//prozor.setIconImage(); podesva sliku na prozoru
		*/
		
	}
	
	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		//	e.getSource(); //vraca komponentu koja je pritisnuta
		if (e.getSource() == dugme) {
			System.out.println("Dugme pritisnuto.");
			
		}
			
		}
		
	}

}