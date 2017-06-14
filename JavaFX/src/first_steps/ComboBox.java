package first_steps;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ComboBox extends JFrame implements ActionListener {
	JButton b1;
	JLabel info;
	JTextField km;
	JLabel wynik;
	JComboBox<String> combo;
	String[] jednostki = new String[] {"Mile", "Mile morskie", "Wiorsta"};
	
	public ComboBox() {
		setTitle("ComboBox");
		setSize(600, 400);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		Font font = new Font("Arial", 0, 15);
		km = new JTextField("Podaj odleg³oœæ w kilometrach");
		km.setBounds(50, 20, 500, 50);
		combo = new JComboBox<>(jednostki);
		combo.setBounds(50, 100, 100, 50);
		combo.setFont(font);
		combo.addActionListener(this);
		wynik = new JLabel();
		wynik.setBounds(50, 200, 500, 50);
		wynik.setFont(font);
		add(combo);
		add(km);
		add(wynik);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int x = 0;
		if (e.getSource().equals(km)) {
			try {
				x = Integer.parseInt(km.getText());
			} catch (Exception e1) {
				wynik.setText("Podaj odleg³oœæ w kilometrach");
			}
		}
		
		if (e.getSource().equals(combo)){
			try {
				x = Integer.parseInt(km.getText());
				switch (combo.getSelectedIndex()) {
				case 0:
					wynik.setText(x + " km to " + (float)(x / 1.609344) + " mili.");
					break;
				case 1:
					wynik.setText(x + " km to " + (float)(x / 1.852) + " mili morskiej.");
					break;
				case 2:
					wynik.setText(x + " km to " + (float)(x / 1.0668) + " wiorst.");
					break;
				}
			} catch (Exception e1) {
				wynik.setText("Podaj odleg³oœæ w kilometrach");
			}
			
		}
		
		
		
	}
}
