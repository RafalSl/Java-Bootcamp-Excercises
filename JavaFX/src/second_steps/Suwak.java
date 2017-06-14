package second_steps;




import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Suwak extends JFrame implements ChangeListener {
	JSlider suw;
	JLabel suwInfo;
	JSpinner spin;
	
	public Suwak() {
		setTitle("Suwak");
		setSize(800, 600);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		suw = new JSlider();
		suw.setBounds(50,50,200,50);
		suw.addChangeListener(this);
		suw.setMajorTickSpacing(10);
		suw.setMinorTickSpacing(1);
		suw.setPaintTicks(true);
		suw.setPaintLabels(true);
		suw.setToolTipText("OK");
		add(suw);
		suwInfo = new JLabel();
		suwInfo.setBounds(50,100,200,100);
		suwInfo.setToolTipText("OK");
		add(suwInfo);
		SpinnerNumberModel value = new SpinnerNumberModel(50, 0, 100, 1);
		spin = new JSpinner(value);
		spin.setBounds(50, 200, 60, 30);
		spin.addChangeListener(this);
		add(spin);
		
	}


	@Override
	public void stateChanged(ChangeEvent e) {
		if (e.getSource().equals(suw)) {
			spin.setValue(suw.getValue());
		} else {
			suw.setValue((int) spin.getValue());
		}
		
		suwInfo.setText("" + suw.getValue());
		
	}
}
