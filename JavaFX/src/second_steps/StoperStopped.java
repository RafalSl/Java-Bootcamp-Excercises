package second_steps;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class StoperStopped extends JFrame implements ActionListener {
	JFrame f;
	Font fontHello, fontHelloMin, fontTime, fontTimeList, fontButton;
	JButton start, lap;
	JLabel timeCounter, timeOverall;
	JList laps;
	
	public StoperStopped() {
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
		timeCounter = new JLabel("12,455");
		timeCounter.setBounds(500, 200, 600, 50);
		timeCounter.setFont(fontTime);
		f.add(timeCounter);
		start = new JButton("Start");
		start.setBounds(400, 350, 150, 50);
		start.setFont(fontButton);
		f.add(start);
		lap = new JButton("Lap");
		lap.setBounds(600, 350, 150, 50);
		lap.setFont(fontButton);
		f.add(lap);
		f.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
