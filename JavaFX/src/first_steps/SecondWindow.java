package first_steps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SecondWindow extends JFrame implements ActionListener {
	JButton b1, b2;
	
	SecondWindow(String title, int wys, int szer) {
		super(title);
		setSize(wys, szer);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void addButton() {
		b1 = new JButton("OK");
		b1.setBounds(190, 50, 100, 100);
		this.add(b1);
		b1.addActionListener(this);
		
		b2 = new JButton("OK");
		b2.setBounds(290, 50, 100, 100);
		this.add(b2);
		b2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent o) {
		if (o.getSource().equals(b2)) {
			if (b1.getText().equals("OK")) {
				b1.setText("NOK");
			} else {
				b1.setText("OK");
			} 
		
		}
		
	}

}
