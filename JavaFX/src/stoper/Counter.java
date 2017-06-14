package stoper;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Duration;
import java.time.Instant;

public class Counter implements ActionListener {
	private boolean go;
	private int seconds = 0, miliSeconds, miliSecondsTmp;
	private Instant instant_time, start_time, stop_time;
	
	public Counter() {
		go = false;
	}
	
	void stoper() {
		
		start_time = Instant.now();
		while (go = true) {
			instant_time = Instant.now();
			miliSeconds = (Duration.between(start_time, instant_time).getNano() / 1000000);
			miliSecondsTmp = miliSeconds;
			if (miliSeconds < miliSecondsTmp) seconds++;
		}
		stop_time = Instant.now();
		miliSeconds = (Duration.between(start_time, stop_time).getNano() / 1000000);
		
	}

	public boolean isGo() {
		return go;
	}

	public void setGo(boolean go) {
		this.go = go;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	public int getMiliSeconds() {
		return miliSeconds;
	}

	public void setMiliSeconds(int miliSeconds) {
		this.miliSeconds = miliSeconds;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals()) {
			
		}
		
	}
}
