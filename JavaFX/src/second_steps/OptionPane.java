package second_steps;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class OptionPane extends JFrame {
	Font font;
	
	public OptionPane() {
		JFrame f = new JFrame();
		f.setTitle("Wyskakuj¹ce okienka");
		f.setSize(800, 600);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		font = new Font("Calbri", 1, 25);
		JLabel l1 = new JLabel();
		l1.setBounds(100, 100, 250, 250);
		l1.setFont(font);
		f.add(l1);
		f.setVisible(true);
		JOptionPane.showMessageDialog(f, "Witaj w tym wspania³ym programie!");
		String imie = JOptionPane.showInputDialog(f, "Podaj swoje imiê");
		l1.setText("Witaj " + imie);
		f.repaint();
	}
}
