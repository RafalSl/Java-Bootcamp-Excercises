package first_steps;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class HelloName extends JFrame implements ActionListener {
	JLabel hello;
	JButton b;
	JTextField jf;
	Font font;
	
	public HelloName(String title, int szer, int wys) {
		super(title);
		setSize(szer, wys);
		setLayout(null);
//		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		font = new Font("Arial", 1, 35);
		hello = new JLabel("Hello World");
		hello.setBounds(50, 50, 300, 50);
		hello.setFont(font);
		this.add(hello);
		b = new JButton("Skurcz");
		b.setBounds(50, 100, 150, 50);
		b.addActionListener(this);
		this.add(b);
		jf = new JTextField("Podaj imiê");
		jf.setBounds(50, 200, 150, 50);
		jf.addActionListener(this);
		add(jf);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(jf)) {
			hello.setText("Witaj " + jf.getText());
		} else {
			this.setSize(10, 10);
		}
	}

}
