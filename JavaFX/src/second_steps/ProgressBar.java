package second_steps;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBar extends JFrame {
	JProgressBar pasek;
	int i = 0;
	
	ProgressBar() {
		setTitle("Progress Bar");
		setSize(800, 600);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		pasek = new JProgressBar(0, 100);
		pasek.setBounds(200, 280, 400, 40);
		pasek.setValue(0);
		pasek.setStringPainted(true);
		add(pasek);
		setVisible(true);
	}
	
	public void start() {
		while (i <= 100) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
			i += 10;
			pasek.setValue(i);
		}
	}
}
