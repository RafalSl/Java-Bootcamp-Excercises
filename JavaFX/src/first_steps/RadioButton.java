package first_steps;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class RadioButton extends JFrame implements ActionListener {
	JRadioButton r1, r2, r3, r4;
	JButton b1;
	JLabel info;
	JRadioButton[] radiobuttons = new JRadioButton[4];
	
	public RadioButton(){
		setTitle("RadioBox");
		setSize(500, 300);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		Font font = new Font("Arial", 0, 15);
		r1 = new JRadioButton("R1");
		r1.setBounds(20, 20, 50, 20);
		r2 = new JRadioButton("R2");
		r2.setBounds(20, 50, 50, 20);
		r3 = new JRadioButton("R3");
		r3.setBounds(20, 80, 50, 20);
		r4 = new JRadioButton("R4");
		r4.setBounds(20, 110, 50, 20);
		radiobuttons[0] = r1;
		radiobuttons[1] = r2;
		radiobuttons[2] = r3;
		radiobuttons[3] = r4;
		ButtonGroup bg = new ButtonGroup();
		b1 = new JButton("Sprawdz");
		b1.setBounds(20, 150, 400, 40);
		b1.addActionListener(this);
		info = new JLabel();
		info.setBounds(20, 200, 250, 90);
		info.setFont(font);
		add(info);
		for(int i = 0; i < 4; i++) {
			add(radiobuttons[i]);
			bg.add(radiobuttons[i]);
		}
		add(b1);
		setVisible(true);
}

	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i = 0; i < 4; i++) {
			if (((AbstractButton) radiobuttons[i]).isSelected()) info.setText("Zaznaczono " + (radiobuttons[i].getText()));
		}
		
	}
}
