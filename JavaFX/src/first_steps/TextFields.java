package first_steps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TextFields extends JFrame implements ActionListener {
	JTextArea p1, p2;
	JButton b1;
	
	public TextFields(String title, int szer, int wys) {
		super(title);
		setSize(szer, wys);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p1 = new JTextArea();
		p1.setBounds(50, 50, 300, 200);
		p2 = new JTextArea();
		p2.setBounds(400, 50, 300, 200);
		b1 = new JButton("Zamieñ");
		b1.setBounds(330, 300, 90, 30);
		b1.addActionListener(this);
		add(p1);
		add(p2);
		add(b1);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String tmp = p1.getText();
		p1.setText(p2.getText());
		p2.setText(tmp);
	}

}
