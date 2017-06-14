package first_steps;

import javax.swing.JFrame;

public class FirstWindow extends JFrame{
	
	FirstWindow(String title, int wys, int szer) {
		super(title);
		setSize(wys, szer);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
	
	

