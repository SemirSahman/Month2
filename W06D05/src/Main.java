import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3239860432378254486L;
	private JButton[] buttons = new JButton[9];
	private String[] textOnButtons = { "1", "2", "3", "4", "5", "6", "7", "8",
			"9" };
	
	
	public Main(){
		
		for(int i = 0;i<buttons.length;i++){
			buttons[i].setText(textOnButtons[i]);;
			add(buttons[i]);
		}

		setLayout(new GridLayout(3,3));
		
		
		
		setSize(400, 300);
		setTitle("Task1");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	

	public static void main(String[] args) {
		new Main();
	}

}
