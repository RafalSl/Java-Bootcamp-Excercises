package first_steps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

public class Password extends JFrame implements ActionListener {
	JPasswordField pass1;
	JButton b1;
	JLabel hello;
	String password = "test";
	
	public Password (String title, int szer, int wys) {
		super(title);
		setSize(szer, wys);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pass1 = new JPasswordField();
		pass1.setBounds(50, 100, 150, 30);
		b1 = new JButton("Sprawdz has³o");
		b1.setBounds(80, 150, 90, 50);
		b1.addActionListener(this);
		hello = new JLabel();
		hello.setBounds(50, 50, 200, 50);
		add(pass1);
		add(b1);
		add(hello);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String pass = new String(pass1.getPassword());
		
		if (pass.equals(password)) {
			PassCheck check = new PassCheck("Witaj! " + pass);
		} else {
			PassCheck check = new PassCheck("Z³e has³o!");
		}
		
	}
	
	
}
