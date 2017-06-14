package first_steps;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Chceckbox extends JFrame implements ActionListener {
	JCheckBox c1, c2, c3, c4;
	JButton b1;
	JLabel info;
	JCheckBox[] checkboxes = new JCheckBox[4];
	
	public Chceckbox(){
		setTitle("ChceckBox");
		setSize(500, 300);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		Font font = new Font("Arial", 0, 15);
		c1 = new JCheckBox("C1");
		c1.setBounds(20, 20, 50, 20);
		c2 = new JCheckBox("C2");
		c2.setBounds(20, 50, 50, 20);
		c3 = new JCheckBox("C3");
		c3.setBounds(20, 80, 50, 20);
		c4 = new JCheckBox("C4");
		c4.setBounds(20, 110, 50, 20);
		checkboxes[0] = c1;
		checkboxes[1] = c2;
		checkboxes[2] = c3;
		checkboxes[3] = c4;
		b1 = new JButton("Sprawdz");
		b1.setBounds(20, 150, 100, 40);
		b1.addActionListener(this);
		info = new JLabel();
		info.setBounds(20, 180, 190, 90);
		info.setFont(font);
		add(info);
		for(int i = 0; i < 4; i++) {
			add(checkboxes[i]);
		}
		add(b1);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		StringBuffer tmp = new StringBuffer();
		for(int i = 0; i < 4; i++) {
			if (((AbstractButton) checkboxes[i]).isSelected()) tmp.append(" c" + (i+1));
		}
		if (tmp.length() > 0 ){
			info.setText("Zaznaczono " + tmp.toString());
		} else info.setText("");
		
	}
}