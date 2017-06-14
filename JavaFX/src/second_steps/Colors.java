package second_steps;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Colors extends JFrame implements MouseListener {
	JLabel l1, l2, l3;
	Color initial, newColor1, newColor2, newColor3;
	
	public Colors() {
		setTitle("Labels Color");
		setSize(800, 600);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		initial = new Color(0, 0, 0);
		newColor1 = new Color(0, 0, 0);
		newColor2 = new Color(0, 0, 0);
		newColor3 = new Color(0, 0, 0);
		l1 = new JLabel("Label 1");
		l1.setBounds(50, 50, 200, 50);
		l1.addMouseListener(this);
		l2 = new JLabel("Label 2");
		l2.setBounds(50, 150, 200, 50);
		l2.addMouseListener(this);
		l3 = new JLabel("Label 3");
		l3.setBounds(50, 250, 200, 50);
		l3.addMouseListener(this);
		add(l1);
		add(l2);
		add(l3);
		setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource().equals(l1)) {
			newColor1 = JColorChooser.showDialog(l1, "Wybierz kolor", initial);
			l1.setForeground(newColor1);
		}
		if (e.getSource().equals(l2)) {
			newColor2 = JColorChooser.showDialog(l2, "Wybierz kolor", initial);
			l2.setForeground(newColor2);
		}
		if (e.getSource().equals(l3)) {
			newColor3 = JColorChooser.showDialog(l3, "Wybierz kolor", initial);
			l3.setForeground(newColor3);
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource().equals(l1)) {
			l1.setForeground(Color.CYAN);
		}
		if (e.getSource().equals(l2)) {
			l2.setForeground(Color.GREEN);
		}
		if (e.getSource().equals(l3)) {
			l3.setForeground(Color.RED);
		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource().equals(l1)) {
			l1.setForeground(newColor1);
		}
		if (e.getSource().equals(l2)) {
			l2.setForeground(newColor2);
		}
		if (e.getSource().equals(l3)) {
			l3.setForeground(newColor3);
		}
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
