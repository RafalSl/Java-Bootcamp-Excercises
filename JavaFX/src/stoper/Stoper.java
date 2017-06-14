package stoper;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.Duration;
import java.time.Instant;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class Stoper extends JFrame implements ActionListener, MouseListener {
	JFrame f;
	Counter licznik;
	Font fontHello, fontHelloMin, fontTime, fontTimeList, fontButton;
	JButton start, lap;
	JLabel timeCounter, timeOverall;
	JList<String> laps;
	
	public Stoper() {
		licznik= new Counter();
		f = new JFrame();
		f.setTitle("Stoper");
		f.setSize(1200, 900);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		fontHello = new Font("Calbri", 1, 40);
		fontHelloMin = new Font("Calbri", 1, 12);
		fontTime = new Font("Calbri", 1, 50);
		fontButton = new Font("Calbri", 1, 25);
		JLabel hello = new JLabel();
		hello.setBounds(500, 70, 200, 50);
		hello.setText("Stoper");
		hello.setFont(fontHello);
		JLabel helloMin = new JLabel();
		helloMin.setBounds(580, 100, 200, 30);
		helloMin.setText("by Rafa³ S³omka");
		helloMin.setFont(fontHelloMin);
		f.add(hello);
		f.add(helloMin);
		timeCounter = new JLabel("0");
		timeCounter.setBounds(500, 200, 600, 50);
		timeCounter.setFont(fontTime);
		f.add(timeCounter);
		start = new JButton("Start");
		start.setBounds(400, 350, 150, 50);
		start.setFont(fontButton);
		start.addActionListener(this);
		start.addActionListener(licznik);
		start.addMouseListener(this);
		f.add(start);
		lap = new JButton("Lap");
		lap.setBounds(600, 350, 150, 50);
		lap.setFont(fontButton);
		f.add(lap);
		f.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent l) {
/*		if (e.getSource().equals(start) && !licznik.isGo()) {
			licznik.setGo(true);
			start.setText("Stop");
			while () {
				timeCounter.setText(licznik.getSeconds() + "," + licznik.getMiliSeconds());
				f.repaint();
			}
		}	
		
		if (e.getSource().equals(start) && licznik.isGo()) {
			licznik.setGo(false);
			start.setText("Start");
		}*/
	}


	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getSource().equals(start)) {
			licznik.setGo(true);
			if (start.getText().equals("Start")) {
				start.setText("Stop");
			} else {
				start.setText("Start");
			}
			while (start.getText().equals("Stop")) {
				timeCounter.setText(licznik.getSeconds() + "," + licznik.getMiliSeconds());
				f.repaint();
			}
		}
	}
		
/*		if (e.getSource().equals(start) && start.getText().equals("Start")) {
			licznik.setGo(false);
			start.setText("Start");
		}
		
	}

*/
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
