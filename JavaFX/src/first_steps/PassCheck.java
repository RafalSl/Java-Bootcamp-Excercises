package first_steps;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class PassCheck extends JFrame implements ActionListener {
	public PassCheck(String message){
		setTitle("Pass check");
		setSize(100, 200);
		setLayout(null);
		Font font = new Font("Arial", 0, 20);
		JLabel check = new JLabel(message);
		check.setBounds(10, 10, 190, 90);
		check.setFont(font);
		add(check);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
